package it.thehighfly.the_high_fly.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.BookingDaoImpl;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import it.thehighfly.the_high_fly.repository.VeicoloDaoImpl;

public class BookingServiceImpl implements BookingService{
	
	//TODO: annotations
	private VeicoloDaoImpl vdao;
	private ClienteDao cdao;
	private BookingDaoImpl bdao;
	
	@Override
	public ClienteVo searchClienteByPK(int idCliente) {
		return null;
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
			//TODO: implementa metodo calcolo differenza giorni
			return book.getVeicolo().getPrezzo()*(bdao.calcolaIntervalloGiorni(book.getIdPrenotazione()));
				
		}
	}
	

}
