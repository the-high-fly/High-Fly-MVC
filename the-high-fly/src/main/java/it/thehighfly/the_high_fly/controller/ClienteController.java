package it.thehighfly.the_high_fly.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.thehighfly.the_high_fly.model.ClienteVo;

import it.thehighfly.the_high_fly.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/login/", method = RequestMethod.POST)
	public ResponseEntity<ClienteVo> insertClient(){
		
		 //todo
		return null;
	}
	
	

}
