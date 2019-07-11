package it.thehighfly.the_high_fly.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.thehighfly.the_high_fly.config.ResponseMessage;
import it.thehighfly.the_high_fly.exceptions.UserException;

import it.thehighfly.the_high_fly.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/login/", method = RequestMethod.POST)
	public ResponseMessage loginCliente() throws UserException{
		
		 ResponseMessage rm = new ResponseMessage();
		 
		 try {
			String username = null;
			String password = null;
			ClienteDto logged = clienteService.loginCliente(username, password);
			rm.setCode("OK"); 
			rm.setData(logged);
			
		 }catch(Exception e) {
			 rm.setCode("KO");
			 rm.getErrorMessages().add("Errore grave spegni e riaccendi!");
		 }
		return rm;
	}
	
	@RequestMapping(value= "/registra/", method = RequestMethod.PUT)
	public ResponseMessage insertCliente(@RequestBody ClienteDto newCliente){
		
			ResponseMessage rm = new ResponseMessage();
		try {
			ClienteDto insertedOne = clienteService.insertCliente(newCliente);
			rm.setCode("OK");
			rm.setData(insertedOne);
			
		}catch(UserException e) {
			rm.setCode("OK");
			rm.getErrorMessages().add("error_usercreate_already_exists");
		
		}catch(Exception e) {
			rm.setCode("KO");
			rm.getErrorMessages().add("Errore grave spegni e riaccendi!");
		}
		return rm;
	}
}