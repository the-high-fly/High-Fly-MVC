package it.thehighfly.the_high_fly.model;

public class PrenotazionePrivatoVo extends Prenotazione {

	
	private String dataInizio;
	private String dataFine;
	
	public PrenotazionePrivatoVo(int id, int numPartcipanti, String nome, String cognome, double prezzoTotale,
			String stato, ClienteVo cliente, VeicoloVo veicolo, String dataInizio, String dataFine) {
		super(id, numPartcipanti, nome, cognome, prezzoTotale, stato, cliente, veicolo);
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
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
	
	
	
}
