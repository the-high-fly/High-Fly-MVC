package it.thehighfly.the_high_fly.services;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.BookingDao;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import it.thehighfly.the_high_fly.repository.VeicoloDao;

public class BookingServiceImpl implements BookingService{
	
	//TODO: annotations
	private VeicoloDao vdao;
	private ClienteDao cdao;
	private BookingDao bdao;
	
	@Override
	public ClienteVo searchClienteByPK(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VeicoloVo searchVeicoloByPK(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcolaPrezzoTotale(BookingDto book) {
		if (book.getVeicolo().getTipo().equals("Treno") | book.getVeicolo().getTipo().equals("Nave")
				| book.getVeicolo().getTipo().equals("Aereo")) {
			return book.getVeicolo().getPrezzo()*book.getNumPartecipanti();
		}
		else {
			//TODO: implementa metodo calcolo differenza giorni
			return book.getVeicolo().getPrezzo()*calcolaGiorni(book);
				
			}
		}
	}

}
