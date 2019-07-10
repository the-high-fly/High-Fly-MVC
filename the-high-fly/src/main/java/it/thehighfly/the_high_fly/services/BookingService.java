package it.thehighfly.the_high_fly.services;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;

public interface BookingService {

	ClienteVo searchClienteByPK(int idCliente);
	VeicoloVo searchVeicoloByPK(int idVeicolo);
	double calcolaPrezzoTotale(BookingDto book);
	BookingVo getVoFromBookingDto(BookingDto bdto);
	BookingDto getDtoFromBookingVo(BookingVo bvo);
}
