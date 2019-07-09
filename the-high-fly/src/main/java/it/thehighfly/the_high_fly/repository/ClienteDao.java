package it.thehighfly.the_high_fly.repository;

import it.thehighfly.the_high_fly.model.ClienteVo;

public interface ClienteDao {

	public ClienteVo searchClienteByPK(int codice);
	
	public boolean insertCliente(int idCliente, int privato, String username, String password);

}
