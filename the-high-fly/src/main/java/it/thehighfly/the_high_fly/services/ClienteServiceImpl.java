package it.thehighfly.the_high_fly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.repository.ClienteDaoImpl;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService{

	@Autowired(required= true)
	private ClienteDaoImpl clienteDao;
	
	
	@Override
	public ClienteVo loginCliente(String username, String password) {
		return clienteDao.loginCliente(username, password);
	}
	
	@Override 
	public ClienteVo insertCliente(int privato, String username, String password) {
		return clienteDao.insertCliente(privato, username, password);
	}

	
	
}
