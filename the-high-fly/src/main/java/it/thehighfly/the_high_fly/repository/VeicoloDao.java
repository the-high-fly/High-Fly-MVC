package it.thehighfly.the_high_fly.repository;

import java.util.ArrayList;

import it.thehighfly.the_high_fly.model.VeicoloVo;

public interface VeicoloDao {
	
	public ArrayList<VeicoloVo> getListaVeicoli();
	
	public void printListaVeicoli(ArrayList<VeicoloVo> listaVeicoli);
}
