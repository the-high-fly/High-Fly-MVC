package it.thehighfly.the_high_fly.repository;

import it.thehighfly.the_high_fly.model.ClienteVo;

public interface ClienteDao {

	public ClienteVo searchClienteByPK(int codice);
	
	public boolean insertCliente(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataPartenza, String dataArrivo, String luogoPartenza, String luogoArrivo, String stato);

}
