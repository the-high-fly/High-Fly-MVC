package it.thehighfly.the_high_fly.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.BookingDao;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import it.thehighfly.the_high_fly.repository.VeicoloDao;

@Service("bookingService")
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private VeicoloDao veicoloDao;
	@Autowired
	private ClienteDao clienteDao;
	@Autowired
	private BookingDao bookingDao;
	
	@Override
	public ClienteVo searchClienteByPK(int idCliente) {
		return clienteDao.searchClienteByPK(idCliente);
	}

	@Override
	public VeicoloVo searchVeicoloByPK(int idVeicolo) {
		return veicoloDao.getVeicolo(idVeicolo);
	}

	@Override
	public double calcolaPrezzoTotale(BookingDto book) {
		if (book.getVeicolo().getTipo().equals("Treno") | book.getVeicolo().getTipo().equals("Nave")
				| book.getVeicolo().getTipo().equals("Aereo")) {
			return book.getVeicolo().getPrezzo()*book.getNumPartecipanti();
		}
		else {
			return book.getVeicolo().getPrezzo()*(bookingDao.calcolaIntervalloGiorni(book.getIdPrenotazione()));
				
		}
	}

	@Override
	public BookingVo getVoFromBookingDto(BookingDto bdto) {
		return new BookingVo(bdto.getIdPrenotazione(), bdto.getCliente().getIdCliente(), 
				bdto.getVeicolo().getId(), bdto.getNome(), bdto.getCognome(),
				bdto.getNumPartecipanti(), calcolaPrezzoTotale(bdto), bdto.getDataInizio(), 
				bdto.getDataFine(), bdto.getLuogoPartenza(), bdto.getLuogoArrivo(), bdto.getStato());
	}

	@Override
	public BookingDto getDtoFromBookingVo(BookingVo bvo) {
		return new BookingDto(bvo.getIdPrenotazione(), searchClienteByPK(bvo.getIdCliente()),
				searchVeicoloByPK(bvo.getIdVeicolo()), bvo.getNome(), bvo.getCognome(), 
				bvo.getNumPartecipanti(), bvo.getDataInizio(), bvo.getDataFine(), bvo.getLuogoPartenza(),
				bvo.getLuogoArrivo(), bvo.getStato());
	}

	@Override
	public BookingDto getBookingByCode(String code) {
		return getDtoFromBookingVo(bookingDao.searchBookByPK(code));
	}

	@Override
	public ArrayList<BookingDto> getBookingList(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
