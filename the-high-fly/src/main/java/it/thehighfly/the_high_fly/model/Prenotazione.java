package it.thehighfly.the_high_fly.model;

public class Prenotazione {

	private int id;
	private int numPartcipanti;
	private String nome;
	private String cognome;
	private double prezzoTotale;
	private String stato;
	private ClienteVo cliente;
	private VeicoloVo veicolo;
	
	public Prenotazione(int id, int numPartcipanti, String nome, String cognome, double prezzoTotale, String stato,
			ClienteVo cliente, VeicoloVo veicolo) {
		this.id = id;
		this.numPartcipanti = numPartcipanti;
		this.nome = nome;
		this.cognome = cognome;
		this.prezzoTotale = prezzoTotale;
		this.stato = stato;
		this.cliente = cliente;
		this.veicolo = veicolo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumPartcipanti() {
		return numPartcipanti;
	}

	public void setNumPartcipanti(int numPartcipanti) {
		this.numPartcipanti = numPartcipanti;
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

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
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
	
	
}
