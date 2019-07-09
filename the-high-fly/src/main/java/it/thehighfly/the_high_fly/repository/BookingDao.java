package it.thehighfly.the_high_fly.repository;

import  it.thehighfly.the_high_fly.model.BookingVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class BookingDao implements BookingRepo{

	public BookingVo searchBookByPK(String codice) {
		// TODO Auto-generated method stub
		return null;
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

}
