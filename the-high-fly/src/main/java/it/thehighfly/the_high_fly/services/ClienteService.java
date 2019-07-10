package it.thehighfly.the_high_fly.services;


public interface ClienteService {

	boolean insertCliente(int idCliente, int privato, String username, String password);
	boolean loginCliente(String username, String password);

}
