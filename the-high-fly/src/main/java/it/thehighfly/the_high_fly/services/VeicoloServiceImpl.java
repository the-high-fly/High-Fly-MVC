package it.thehighfly.the_high_fly.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.VeicoloDao;

public class VeicoloServiceImpl implements VeicoloService {
	
	@Autowired
	private VeicoloDao veicolo;

	@Override
	public ArrayList<VeicoloVo> listVeicoli() {
		return veicolo.getListaVeicoli();
	}
	
	
}
