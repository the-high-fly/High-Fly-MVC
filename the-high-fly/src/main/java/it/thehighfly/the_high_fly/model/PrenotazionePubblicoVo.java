package it.thehighfly.the_high_fly.model;

public class PrenotazionePubblicoVo extends Prenotazione{


	private String luogoPartenza;
	private String luogoArrivo;
	private String dataPartenza;

		public PrenotazionePubblicoVo(int id, int numPartcipanti, String nome, String cognome, double prezzoTotale,
				String stato, ClienteVo cliente, Veicolo veicolo, String luogoPartenza, String luogoArrivo,
				String dataPartenza) {
			super(id, numPartcipanti, nome, cognome, prezzoTotale, stato, cliente, veicolo);
			this.luogoPartenza = luogoPartenza;
			this.luogoArrivo = luogoArrivo;
			this.dataPartenza = dataPartenza;
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

		public String getDataPartenza() {
			return dataPartenza;
		}

		public void setDataPartenza(String dataPartenza) {
			this.dataPartenza = dataPartenza;
		}
		
}
