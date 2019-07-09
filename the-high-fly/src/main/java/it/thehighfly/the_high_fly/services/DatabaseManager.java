package it.thehighfly.the_high_fly.services;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseManager {

	public Connection getConnection();
}
