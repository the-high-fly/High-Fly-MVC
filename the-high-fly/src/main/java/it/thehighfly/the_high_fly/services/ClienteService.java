package it.thehighfly.the_high_fly.services;

import it.thehighfly.the_high_fly.model.ClienteVo;

public interface ClienteService {

	ClienteVo insertCliente(int idCliente, int privato, String username, String password);
	ClienteVo loginCliente(String username, String password);

}
