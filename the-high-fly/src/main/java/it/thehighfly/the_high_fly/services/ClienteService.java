package it.thehighfly.the_high_fly.services;

import it.thehighfly.the_high_fly.controller.ClienteDto;
import it.thehighfly.the_high_fly.exceptions.UserException;

public interface ClienteService {

	ClienteDto loginCliente(String username, String password);
	ClienteDto insertCliente(ClienteDto newCliente) throws UserException;

}
