package it.thehighfly.the_high_fly.services;

import org.springframework.beans.factory.annotation.Autowired;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.BookingDaoImpl;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import it.thehighfly.the_high_fly.repository.VeicoloDaoImpl;

public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private VeicoloDaoImpl vdao;
	@Autowired
	private ClienteDao cdao;
	@Autowired
	private BookingDaoImpl bdao;
	
	@Override
	public ClienteVo searchClienteByPK(int idCliente) {
		return cdao.searchClienteByPK(idCliente);
	}

	@Override
	public VeicoloVo searchVeicoloByPK(int idVeicolo) {
		return vdao.getVeicolo(idVeicolo);
	}

	@Override
	public double calcolaPrezzoTotale(BookingDto book) {
		if (book.getVeicolo().getTipo().equals("Treno") | book.getVeicolo().getTipo().equals("Nave")
				| book.getVeicolo().getTipo().equals("Aereo")) {
			return book.getVeicolo().getPrezzo()*book.getNumPartecipanti();
		}
		else {
			return book.getVeicolo().getPrezzo()*(bdao.calcolaIntervalloGiorni(book.getIdPrenotazione()));
				
		}
	}

	@Override
	public BookingVo getVoFromBookingDto(BookingDto bdto) {
		return new BookingVo(bdto.getIdPrenotazione(), bdto.getCliente().getIdCliente(), 
				bdto.getVeicolo().getId(), bdto.getNome(), bdto.getCognome(),
				bdto.getNumPartecipanti(), calcolaPrezzoTotale(bdto), bdto.getDataInizio(), 
				bdto.getDataFine(), bdto.getLuogoPartenza(), bdto.getLuogoArrivo(), bdto.getStato());
	}
	

}
