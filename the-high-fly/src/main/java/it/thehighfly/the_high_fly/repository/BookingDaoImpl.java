package it.thehighfly.the_high_fly.repository;

import it.thehighfly.the_high_fly.controller.BookingDto;
import  it.thehighfly.the_high_fly.model.BookingVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BookingDaoImpl implements BookingDao{
	
	@AutoWired(required = true)
	private DatabaseManager databaseManager;

	public BookingVo searchBookByPK(String codice) {
		Connection connection = null;
		PreparedStatement pstm = null;
		
		String query = "select * from SYS.BOOKING where ID_PRENOTAZIONE = ?";
		
		BookingVo book = null;
		
		try {
			pstm = connection.prepareStatement(query);
			pstm.setString(1, codice);
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				book = new BookingVo(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getString(8), rs.getString(9),
						rs.getString(10), rs.getString(11), rs.getString(12));
				System.out.println("La ricerca è andata a buon fine!");
				return book;
			}
			
		}
		catch(SQLException e) {
			System.out.println("La ricerca non è andata a buon fine.");
		}
		
		System.out.println("Nessun utente corrisponde ai criteri di ricerca.");
		return book;
	}

	public boolean insertBook(int idCliente, int idVeicolo, String nome, String cognome, int numPartecipanti,
			double prezzo, String dataInizio, String dataFine, String luogoPartenza, String luogoArrivo,
			String stato) {
		
		Connection connection = null;
		
		String query = "insert into SYS.BOOKING values (?, ?, ?, ?, ?, ?, ?, to_date(?, 'DD/MM/YYYY'), "
				+ "to_date(?, 'DD/MM/YYYY'), ?, ?, ?)";
		BookingVo book = null;
		PreparedStatement pstm = null;
		
		try {
			
			//TODO: initialize connection
			book = new BookingVo(idCliente, idVeicolo, nome, cognome, numPartecipanti, prezzo, dataInizio, dataFine, 
					luogoPartenza, luogoArrivo, stato);
			
			pstm = connection.prepareStatement(query);
			
			pstm.setString(1, book.getIdPrenotazione());
			pstm.setInt(2, book.getIdCliente());
			pstm.setInt(3, book.getIdVeicolo());
			pstm.setString(4, book.getNome());
			pstm.setString(5, book.getCognome());
			pstm.setInt(6, book.getNumPartecipanti());
			pstm.setDouble(7, book.getPrezzoTotale());
			pstm.setString(8, book.getDataInizio());
			pstm.setString(9, book.getDataFine());
			pstm.setString(10, book.getLuogoPartenza());
			pstm.setString(11, book.getLuogoArrivo());
			pstm.setString(12, book.getStato());
			
			pstm.executeUpdate();
			return true;
		}
		
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("L'inserimento nella tabella BOOKING non è andato a buon fine.");
			
		}
		return false;
	}
	
public int calcolaIntervalloGiorni(String codice) {
		
		Connection connection = null;
		PreparedStatement pstm = null;
		
		String query = "select (DATA_FINE - DATA_INIZIO) from SYS.BOOKING "
				+ "where ID_PRENOTAZIONE = ?";
		
		try {
			connection = databaseManager.getConnection();
			pstm = connection.prepareStatement(query);
			pstm.setString(1, codice);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

}
