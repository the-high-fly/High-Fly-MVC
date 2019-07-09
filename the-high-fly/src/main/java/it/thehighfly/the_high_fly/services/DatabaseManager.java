package it.thehighfly.the_high_fly.services;

import java.sql.Connection;

public interface DatabaseManager {

	public Connection getConnection();
	
	public Connection startConnection();
}
