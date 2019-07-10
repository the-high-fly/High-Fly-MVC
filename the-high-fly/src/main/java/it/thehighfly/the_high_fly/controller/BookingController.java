package it.thehighfly.the_high_fly.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.thehighfly.the_high_fly.services.BookingService;
import it.thehighfly.the_high_fly.services.VeicoloService;


@RestController
@RequestMapping("/api")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
//TODO: fai il metodo in booking service!!!!
//	@RequestMapping(value = "/listaPrenotazioni/", method = RequestMethod.GET)
//    public ResponseEntity<ArrayList<BookingDto>> listBooking(int idCliente) {
//		ArrayList<BookingDto> list;
//		
//		try {
//			list=bookingService.
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		return list;
//	}

	
}
