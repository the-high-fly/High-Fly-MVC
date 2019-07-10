package it.thehighfly.the_high_fly.services;

import org.springframework.beans.factory.annotation.Autowired;
import it.thehighfly.the_high_fly.repository.ClienteDaoImpl;

public class ClienteServiceImpl implements ClienteService{

	@Autowired 
	private ClienteDaoImpl cdao;
	
	@Override
	public boolean loginCliente(String username, String password) {
		return cdao.loginCliente(username, password);
	}
	
	@Override 
	public boolean insertCliente(int idCliente, int privato, String username, String password) {
		return cdao.insertCliente(idCliente, privato, username, password);
	}

	
	
}
