package it.thehighfly.the_high_fly.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.thehighfly.the_high_fly.model.ClienteVo;

public class ClienteDaoImpl {
	
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
	
	
	
	public boolean insertCliente(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataPartenza, String dataArrivo, String luogoPartenza, String luogoArrivo, String stato) {
				
		String query = "insert into Cliente(idCliente, idVeicolo, nome, cognome, numPartecipanti, " + 
					"prezzo, dataPartenza, dataArrivo, luogoPartenza, luogoArrivo, stato) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?) ";
		
		PreparedStatement pstm = null;
		boolean isNotEmpty = false;
		
		try {
			pstm = this.connection.prepareStatement(query);
			pstm.setInt(1, idCliente);
			pstm.setInt(2, idVeicolo);
			pstm.setString(3, nome);
			pstm.setString(4, cognome);
			pstm.setInt(5, numPartecipanti);
			pstm.setDouble(6, prezzo);
			pstm.setString(7, dataPartenza);
			pstm.setString(8, dataArrivo);
			pstm.setString(9, luogoPartenza);
			pstm.setString(10, luogoArrivo);
			pstm.setString(11, stato);
			
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
}
