package it.thehighfly.the_high_fly.repository;

import it.thehighfly.the_high_fly.model.BookingVo;

public class BookingDao implements BookingRepo{

	public BookingVo searchBookByPK(String codice) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertBook(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataPartenza, String dataArrivo, String luogoPartenza, String luogoArrivo,
			String stato) {
		BookingVo book = new BookingVo();
		return false;
	}

}
