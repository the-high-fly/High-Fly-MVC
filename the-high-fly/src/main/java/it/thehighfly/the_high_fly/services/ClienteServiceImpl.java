package it.thehighfly.the_high_fly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.thehighfly.the_high_fly.controller.ClienteDto;
import it.thehighfly.the_high_fly.exceptions.ErrorCodes;
import it.thehighfly.the_high_fly.exceptions.UserException;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import utils.ClienteUtils;

	
@Service("clienteService")
public class ClienteServiceImpl implements ClienteService{
		
		@Autowired
		private ClienteDao clienteDao;
		
		
		@Override
		public ClienteDto loginCliente(String username, String password) {
			
			ClienteVo cliente = clienteDao.loginCliente(username, password);
			return cliente != null? ClienteUtils.fromVoToDto(cliente) : null;	
		}
		
		
		
		@Override 
		public ClienteDto insertCliente(ClienteDto newCliente) throws UserException {
			
			ClienteDto retCliente = null;
			boolean find = false;
			
			if (find = (clienteDao.searchClienteByPK(newCliente.getIdCliente()))!= null){
				throw new UserException("", ErrorCodes.ERROR_USER_ALREADY_EXISTS);
			}
			
			return retCliente;
		}
}
