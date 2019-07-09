package it.thehighfly.the_high_fly.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.thehighfly.the_high_fly.model.VeicoloVo;

@Repository(value = "VeicoloDao")
public class VeicoloDaoImpl implements VeicoloDao {
 
	@Autowired(required=true)
//	private DatabaseManager databaseManager; 
	
	@Override
	public ArrayList<VeicoloVo> getListaVeicoli() {
		
		ArrayList<VeicoloVo> listaVeicoli = null;
		String query = "select * from sys.veicolo";
		Connection connection = null;
		PreparedStatement stm;
		try {
//			connection = databaseManager.getConnection();
			stm = connection.prepareStatement(query);
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()) {
				listaVeicoli.add(new VeicoloVo(
						rs.getInt(1), rs.getInt(2), 
						rs.getDouble(3), rs.getString(4)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return listaVeicoli;
	}

	@Override
	public void printListaVeicoli(ArrayList<VeicoloVo> listaVeicoli) {
		listaVeicoli.forEach((VeicoloVo v) -> System.out.println(v));
	}

}
