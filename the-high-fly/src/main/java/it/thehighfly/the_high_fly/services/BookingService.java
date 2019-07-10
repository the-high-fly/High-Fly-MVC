package it.thehighfly.the_high_fly.services;

import java.util.ArrayList;

import it.thehighfly.the_high_fly.controller.BookingDto;
import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;

public interface BookingService {

	ClienteVo searchClienteByPK(int idCliente);
	VeicoloVo searchVeicoloByPK(int idCliente);
	double calcolaPrezzoTotale(BookingDto book);
	BookingVo getVoFromBookingDto(BookingDto bdto);
	BookingDto getDtoFromBookingVo(BookingVo bvo);
	BookingDto getBookingByCode(String code);
	ArrayList<BookingDto> getBookingList(int idCliente);
}
