package it.thehighfly.the_high_fly.services;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.thehighfly.the_high_fly.config.ConfigBean;
import oracle.jdbc.pool.OracleDataSource;

@Component("jdbcManager")
@Scope(value = "singleton")
public class JDBCManager implements DatabaseManager {

	@Autowired(required=true)
	private ConfigBean configBean;
	
	private Connection connection;
	
	@Override
	public Connection getConnection() {
		return this.connection;
	}
	
	@PostConstruct
	public Connection startConnection() {
		
		OracleDataSource dataSource;
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL(configBean.getDbhost());
			dataSource.setDatabaseName(configBean.getDbname());
			dataSource.setUser(configBean.getDbuser());
			dataSource.setPassword(configBean.getDbpass());
			
			this.connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connessione non funzionante.");
		}
		return this.connection;
	}
	
}
