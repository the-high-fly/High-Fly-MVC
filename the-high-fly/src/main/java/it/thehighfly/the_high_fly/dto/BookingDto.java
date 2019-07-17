package it.thehighfly.the_high_fly.dto;


import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;


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
	

	public BookingDto(String idPrenotazione, ClienteVo cliente, VeicoloVo veicolo, String nome, String cognome,
			int numPartecipanti, String dataInizio, String dataFine, String luogoPartenza,
			String luogoArrivo, String stato) {
		
		this.idPrenotazione = idPrenotazione;
		this.cliente = cliente;
		this.veicolo = veicolo;
		this.nome = nome;
		this.cognome = cognome;
		this.numPartecipanti = numPartecipanti;
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

	public ClienteVo getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVo cliente) {
		this.cliente = cliente;
	}

	public VeicoloVo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(VeicoloVo veicolo) {
		this.veicolo = veicolo;
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

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	
	
}
