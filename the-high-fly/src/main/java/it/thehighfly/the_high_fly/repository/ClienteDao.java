package it.thehighfly.the_high_fly.repository;

import it.thehighfly.the_high_fly.model.ClienteVo;

public interface ClienteDao {

	public ClienteVo searchClienteByPK(int codice);
	
	public ClienteVo insertCliente(int idCliente, int privato, String username, String password);

	public ClienteVo loginCliente(String username, String password);
}
