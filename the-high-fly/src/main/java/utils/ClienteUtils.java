package utils;

import it.thehighfly.the_high_fly.dto.ClienteDto;
import it.thehighfly.the_high_fly.model.ClienteVo;

public class ClienteUtils {

public static ClienteDto fromVoToDto(ClienteVo cliente) {
		
		ClienteDto dto = new ClienteDto();
		dto.setIdCliente(cliente.getIdCliente());
		
		return dto;
	}
}
