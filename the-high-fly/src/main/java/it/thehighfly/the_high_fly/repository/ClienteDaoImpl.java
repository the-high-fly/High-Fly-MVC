package it.thehighfly.the_high_fly.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.thehighfly.the_high_fly.exceptions.ErrorCodes;
import it.thehighfly.the_high_fly.exceptions.UserException;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.services.DatabaseManager;

@Repository(value = "clienteDao")
public class ClienteDaoImpl implements ClienteDao {

	private Connection connection = null;

	@Autowired(required = true)
	private DatabaseManager databaseManager;

	@Override
	public ClienteVo searchClienteByPK(int codice) {
		String sql = "select * from sys.cliente where id_cliente = ?";
		ClienteVo cliente = null;

		PreparedStatement pstm = null;

		try {
			connection = databaseManager.getConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, codice);

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				cliente = new ClienteVo(rs.getInt("id_cliente"), rs.getInt("privato"), rs.getString("username"),
						rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("il cliente cercato non è presente in db");
		}
		return cliente;
	}

	public ClienteVo insertCliente(int privato, String username, String password) throws UserException {
				
		String query = "insert into sys.cliente "
					+ "values ((select max(id_cliente) from sys_cliente)+1),?,?,?) ";
		
		PreparedStatement pstm = null;
		ClienteVo cliente = null;
		
		try {
			connection = databaseManager.getConnection();
			pstm = connection.prepareStatement(query);
			pstm.setInt(1, privato);
			pstm.setString(2, username);
			pstm.setString(3, password);
			
			int rowsInserite = pstm.executeUpdate();
			if (rowsInserite == 1) {
				System.out.println("cliente inserito correttamente");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				throw new UserException("UserDaoImpl.insertClient", e, ErrorCodes.ERROR_USER_ALREADY_EXISTS);
			} finally {
			try {
				connection.close();
			} catch (SQLException sqle) {
				throw new UserException();
				}
			}		
			}
		return cliente;
	}

	public ClienteVo loginCliente(String username, String password) {

		String sql = "select * from sys.cliente where username = ? and password = ?";

		PreparedStatement pstm = null;
		ClienteVo cliente = null;

		try {
			connection = databaseManager.getConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				cliente = new ClienteVo(rs.getInt("id_Cliente"), rs.getInt("privato"), rs.getString("username"),
						rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}



}