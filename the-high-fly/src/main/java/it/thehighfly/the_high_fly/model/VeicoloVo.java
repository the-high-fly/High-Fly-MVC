package it.thehighfly.the_high_fly.model;

public class VeicoloVo {

	private int id;
	private int numPosti;
	private double prezzo;
	private String descrizione;
	
	public VeicoloVo(int id, int numPosti, double prezzo, String descrizione) {
		this.id = id;
		this.numPosti = numPosti;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
