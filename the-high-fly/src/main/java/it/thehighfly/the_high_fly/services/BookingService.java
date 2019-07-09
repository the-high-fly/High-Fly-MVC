package it.thehighfly.the_high_fly.services;

import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;

public interface BookingService {

	ClienteVo searchClienteByPK(int idCliente);
	VeicoloVo searchVeicoloByPK(int idCliente);
	double calcolaPrezzoTotale(BookingVo book);
}
