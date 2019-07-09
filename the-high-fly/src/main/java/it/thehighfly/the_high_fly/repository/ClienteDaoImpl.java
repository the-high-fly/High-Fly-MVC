package it.thehighfly.the_high_fly.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.thehighfly.the_high_fly.model.ClienteVo;

public class ClienteDaoImpl {
	
private Connection connection = null;

	public ClienteVo searchClienteByPK(int codice) {
		String sql = "select * from cliente where id_cliente = ?";
		ClienteVo cliente= null;
		
		PreparedStatement pstm = null;
		
		try {
			pstm = this.connection.prepareStatement(sql);
			pstm.setInt(1, codice);
			
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				cliente = new ClienteVo(rs.getInt("id_cliente"), rs.getInt("privato"), rs.getString("username"),rs.getString("password"));
			}	
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("il cliente cercato non è presente in db");
		}	
		return cliente;
	}
	
	
	
	public boolean insertCliente(int idCliente, int privato, String username, String password) {
				
		String query = "insert into Cliente(id_Cliente, privato, username, password) "
					+ "values (?,?,?,?) ";
		
		PreparedStatement pstm = null;
		boolean isNotEmpty = false;
		
		try {
			pstm = this.connection.prepareStatement(query);
			pstm.setInt(1, idCliente);
			pstm.setInt(2, privato);
			pstm.setString(3, username);
			pstm.setString(4, password);
			
			int rowsInserite = pstm.executeUpdate();
			if (rowsInserite == 1) {
				System.out.println("cliente inserito correttamente");
				isNotEmpty = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return isNotEmpty;
				
	}
	
	public boolean loginCliente(String username, String password) {
		
		String sql = "select username, password from cliente where username = ? and password = ?";
		
		PreparedStatement pstm = null;
		boolean login = false;
		
		try {
			pstm = this.connection.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				login = (rs.getString("username").equals(username) & rs.getString("password").equals(password));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return login;
	}
	
		
}
