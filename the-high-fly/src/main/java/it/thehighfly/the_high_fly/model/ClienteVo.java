package it.thehighfly.the_high_fly.model;

public class ClienteVo {

	private int idCliente;
	private int privato;
	private String username;
	private String password;
	
	public ClienteVo(int idCliente, int privato, String username, String password) {
		this.idCliente = idCliente;
		this.privato = privato;
		this.username = username;
		this.password = password;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getPrivato() {
		return privato;
	}

	public void setPrivato(int privato) {
		this.privato = privato;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
