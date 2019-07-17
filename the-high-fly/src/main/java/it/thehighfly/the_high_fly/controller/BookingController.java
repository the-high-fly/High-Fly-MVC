package it.thehighfly.the_high_fly.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.thehighfly.the_high_fly.dto.BookingDto;
import it.thehighfly.the_high_fly.services.BookingService;


@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired(required=true)
	private BookingService bookingService;
	
	@RequestMapping(value = "/{id}/listaPrenotazioni/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<BookingDto>> listBooking(@PathVariable("id") int idCliente) {
		ArrayList<BookingDto> list;
		
		try {
			list=bookingService.getBookingList(idCliente);
			if(list==null) {
				System.out.println("Nessuna prenotazione trovata");
				return new ResponseEntity<ArrayList<BookingDto>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<ArrayList<BookingDto>>(list, HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<ArrayList<BookingDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	@RequestMapping(value="/prenotazione/{code}", method = RequestMethod.GET)
	public ResponseEntity<BookingDto> getBookByCode(@PathVariable("code") String code){
		BookingDto book;
		
		try {
			book=bookingService.getBookingByCode(code);
			if(book==null) {
				System.out.println("Prenotazione non trovata");
				return new ResponseEntity<BookingDto>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<BookingDto>(book, HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<BookingDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//@RequestMapping(value="/{id}/prenotazione/{code}/close")

	
}
