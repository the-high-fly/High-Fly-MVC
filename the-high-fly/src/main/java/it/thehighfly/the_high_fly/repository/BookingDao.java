package it.thehighfly.the_high_fly.repository;

import java.util.ArrayList;

import it.thehighfly.the_high_fly.model.BookingVo;

public interface BookingDao {
	
	public BookingVo searchBookByPK(String codice);
	
	public boolean insertBook(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataPartenza, String dataArrivo, String luogoPartenza, String luogoArrivo, String stato);
	
	public int calcolaIntervalloGiorni(String codice);
	
	public ArrayList<BookingVo> getBookingByCliente(int idCliente);

	public void closeBook(int idCliente, String code);

	public ArrayList<BookingVo> getAllBookings(int idCliente);

}
