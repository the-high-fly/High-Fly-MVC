package it.thehighfly.the_high_fly.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.VeicoloDao;

@Service("veicoloService")
public class VeicoloServiceImpl implements VeicoloService {
	
	@Autowired(required=true)
	private VeicoloDao veicoloDao;

	@Override
	public ArrayList<VeicoloVo> listVeicoli() {
		return veicoloDao.getListaVeicoli();
	}

	@Override
	public VeicoloVo retVeicolo(int idVeicolo) {
		return veicoloDao.getVeicolo(idVeicolo);
	}
	
	
}
