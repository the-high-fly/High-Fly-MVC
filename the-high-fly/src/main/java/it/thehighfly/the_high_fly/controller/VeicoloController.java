package it.thehighfly.the_high_fly.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.services.VeicoloService;

@RestController
@RequestMapping("/api")
public class VeicoloController {
	
	@Autowired
	private VeicoloService veicoloService;
	
	@RequestMapping(value = "/veicoli/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<VeicoloVo>> listVehicles() {
    	ArrayList<VeicoloVo> listaVeicoli;
    	
    	try {
    		listaVeicoli = veicoloService.listVeicoli();
    		if(listaVeicoli.isEmpty()){
    			return new ResponseEntity<ArrayList<VeicoloVo>>(HttpStatus.NO_CONTENT);
    		}
    		return new ResponseEntity<ArrayList<VeicoloVo>>(listaVeicoli, HttpStatus.OK);
    	} catch(Exception e) {
    		e.printStackTrace();
    		return new ResponseEntity<ArrayList<VeicoloVo>>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
	@RequestMapping(value = "/veicoli/{id}", method = RequestMethod.GET)
	public ResponseEntity<VeicoloVo> getVehicle(@PathVariable("id") int id) {
		VeicoloVo veicolo;
		try {
			veicolo = veicoloService.retVeicolo(id);
			if (veicolo == null) { 
				System.out.println("Veicolo " + id + " non trovato");
				return new ResponseEntity<VeicoloVo>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<VeicoloVo>(veicolo, HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<VeicoloVo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
