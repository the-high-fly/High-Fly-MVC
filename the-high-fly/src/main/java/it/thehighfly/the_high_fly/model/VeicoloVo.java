package it.thehighfly.the_high_fly.model;

public class VeicoloVo {

	private int id;
	private int numPosti;
	private double prezzo;
	private String tipo;
	
	public VeicoloVo(int id, int numPosti, double prezzo, String tipo) {
		this.id = id;
		this.numPosti = numPosti;
		this.prezzo = prezzo;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ID veicolo: " + id + ", i posti totali sono " + 
				numPosti + ", il costo è " + prezzo + " ed è un veicolo di tipo " + tipo;
	}
	
	
}
