package it.thehighfly.the_high_fly.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.thehighfly.the_high_fly.model.ClienteVo;

public class ClienteDao {
	
private Connection connection = null;

	public ClienteVo searchClienteByPK(String codice) {
		String sql = "select * from cliente where id_cliente = ?";
		ClienteVo cliente= null;
		
		PreparedStatement pstm = null;
		
		try {
			pstm = this.connection.prepareStatement(sql);
			pstm.setString(1, codice);
			
			
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
	
	
	
	public boolean insertBook(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataPartenza, String dataArrivo, String luogoPartenza, String luogoArrivo, String stato) {
				
		
		
		
		return false;
		
		
				
				
	}
}
