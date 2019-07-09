package it.thehighfly.the_high_fly.model;

import java.util.UUID;

public class BookingVo {

	private String idPrenotazione;
	private int idCliente;
	private int idVeicolo;
	private String nome;
	private String cognome;
	private int numPartecipanti;
	private double prezzoTotale;
	private String dataInizio;
	private String dataFine;
	private String luogoPartenza;
	private String luogoArrivo;
	private String stato;
	
	public BookingVo(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti, double prezzoTotale,
			String dataInizio, String dataFine, String luogoPartenza, String luogoArrivo, String stato) {
		this.idPrenotazione = UUID.randomUUID().toString();
		this.idCliente = idCliente;
		this.idVeicolo = idVeicolo;
		this.nome = nome;
		this.cognome = cognome;
		this.numPartecipanti = numPartecipanti;
		this.prezzoTotale = prezzoTotale;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.luogoPartenza = luogoPartenza;
		this.luogoArrivo = luogoArrivo;
		this.stato = stato;
	}

	public String getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(String idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVeicolo() {
		return idVeicolo;
	}

	public void setIdVeicolo(int idVeicolo) {
		this.idVeicolo = idVeicolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumPartecipanti() {
		return numPartecipanti;
	}

	public void setNumPartecipanti(int numPartecipanti) {
		this.numPartecipanti = numPartecipanti;
	}

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public String getLuogoPartenza() {
		return luogoPartenza;
	}

	public void setLuogoPartenza(String luogoPartenza) {
		this.luogoPartenza = luogoPartenza;
	}

	public String getLuogoArrivo() {
		return luogoArrivo;
	}

	public void setLuogoArrivo(String luogoArrivo) {
		this.luogoArrivo = luogoArrivo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
	
	
	
	
}
