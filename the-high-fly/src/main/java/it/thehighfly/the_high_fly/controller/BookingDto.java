package it.thehighfly.the_high_fly.controller;

import it.thehighfly.the_high_fly.model.BookingVo;

public class BookingDto {

	private String idPrenotazione;
	private ClienteVo cliente;
	private VeicoloVo veicolo;
	private String nome;
	private String cognome;
	private int numPartecipanti;
	private double prezzoTotale;
	private String dataInizio;
	private String dataFine;
	private String luogoPartenza;
	private String luogoArrivo;
	private String stato;
	
	public BookingDto(BookingVo book) {
		this.idPrenotazione = book.getIdPrenotazione();
		//metodo dal service
		this.ClienteVo = null;
		this.VeicoloVo = null;
		this.nome = book.getNome();
		this.cognome = book.getCognome();
		this.numPartecipanti = book.getNumPartecipanti();
		//usa il metodo dal service
		this.prezzoTotale = null;
		this.dataInizio = book.getDataInizio();
		this.dataFine = book.getDataFine();
		this.luogoPartenza = book.getLuogoPartenza();
		this.luogoArrivo = book.getLuogoArrivo();
		this.stato = book.getStato();
		
	}
}
