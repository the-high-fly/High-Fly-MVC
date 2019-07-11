package it.thehighfly.the_high_fly.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import it.clever.springsec.entities.User;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.ClienteDaoImpl;
import it.thehighfly.the_high_fly.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/login/", method = RequestMethod.POST)
	public ResponseEntity<ClienteVo> insertClient(){
		
		 //todo
		return 
	}
	
	

}
