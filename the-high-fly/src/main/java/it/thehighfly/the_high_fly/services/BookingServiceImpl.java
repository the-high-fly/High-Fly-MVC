package it.thehighfly.the_high_fly.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.thehighfly.the_high_fly.dto.BookingDto;
import it.thehighfly.the_high_fly.model.BookingVo;
import it.thehighfly.the_high_fly.model.ClienteVo;
import it.thehighfly.the_high_fly.model.VeicoloVo;
import it.thehighfly.the_high_fly.repository.BookingDao;
import it.thehighfly.the_high_fly.repository.ClienteDao;
import it.thehighfly.the_high_fly.repository.VeicoloDao;

@Service("bookingService")
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private VeicoloDao veicoloDao;
	@Autowired
	private ClienteDao clienteDao;
	@Autowired
	private BookingDao bookingDao;
	
	@Override
	public ClienteVo searchClienteByPK(int idCliente) {
		return clienteDao.searchClienteByPK(idCliente);
	}

	@Override
	public VeicoloVo searchVeicoloByPK(int idVeicolo) {
		return veicoloDao.getVeicolo(idVeicolo);
	}

	@Override
	public void calcolaPrezzoTotale(BookingDto book) {
		if (book.getVeicolo().getTipo().equals("Treno") | book.getVeicolo().getTipo().equals("Nave")
				| book.getVeicolo().getTipo().equals("Aereo")) {
			book.setPrezzoTotale(book.getVeicolo().getPrezzo()*book.getNumPartecipanti());
		}
		else {
			book.setPrezzoTotale(book.getVeicolo().getPrezzo()*
					(bookingDao.calcolaIntervalloGiorni(book.getIdPrenotazione())));
				
		}
	}

	@Override
	public BookingVo getVoFromBookingDto(BookingDto bdto) {
		return new BookingVo(bdto.getIdPrenotazione(), bdto.getCliente().getIdCliente(), 
				bdto.getVeicolo().getId(), bdto.getNome(), bdto.getCognome(),
				bdto.getNumPartecipanti(), bdto.getPrezzoTotale(), bdto.getDataInizio(), 
				bdto.getDataFine(), bdto.getLuogoPartenza(), bdto.getLuogoArrivo(), bdto.getStato());
	}

	@Override
	public BookingDto getDtoFromBookingVo(BookingVo bvo) {
		return new BookingDto(bvo.getIdPrenotazione(), searchClienteByPK(bvo.getIdCliente()),
				searchVeicoloByPK(bvo.getIdVeicolo()), bvo.getNome(), bvo.getCognome(), 
				bvo.getNumPartecipanti(), bvo.getDataInizio(), bvo.getDataFine(), bvo.getLuogoPartenza(),
				bvo.getLuogoArrivo(), bvo.getStato());
	}

	@Override
	public BookingDto getBookingByCode(String code) {
		return getDtoFromBookingVo(bookingDao.searchBookByPK(code));
	}

	@Override
	public ArrayList<BookingDto> getBookingList(int idCliente) {
		ArrayList<BookingVo> listVo = bookingDao.getBookingByCliente(idCliente);
		ArrayList<BookingDto> listDto = new ArrayList<BookingDto>();
		
		for (BookingVo bvo : listVo) {
			listDto.add(getDtoFromBookingVo(bvo));
		}
		return listDto;
	}

	@Override
	public void closeBook(int idCliente, String code) {
		bookingDao.closeBook(idCliente, code);
	}

	@Override
	public ArrayList<BookingDto> getAllBookingList(int idCliente) {
		ArrayList<BookingVo> listaVo = bookingDao.getAllBookings(idCliente);
		ArrayList<BookingDto> listaDto = new ArrayList<BookingDto>();
		
		listaVo.forEach((BookingVo book) -> listaDto.add(getDtoFromBookingVo(book)));
		return listaDto;
	}
}
