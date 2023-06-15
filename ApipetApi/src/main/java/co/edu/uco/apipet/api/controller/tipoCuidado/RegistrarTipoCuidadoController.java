package co.edu.uco.apipet.api.controller.tipoCuidado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apipet.api.controller.response.Response;
import co.edu.uco.apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.service.facade.tipoCuidado.RegistrarTipoCuidadosUseCaseFacade;

@RestController
@RequestMapping("apipet/api/v1/tipocuidado")

public class RegistrarTipoCuidadoController {
	
	@Autowired
	private RegistrarTipoCuidadosUseCaseFacade facade;
	
	@PostMapping("/registrartipocuidado")
	public ResponseEntity<Response<TipoCuidadoDTO>> execute(@RequestBody TipoCuidadoDTO tipoCuidadoDTO){
		final Response<TipoCuidadoDTO> response = new Response<>();
		facade.execute(tipoCuidadoDTO);
		List<TipoCuidadoDTO> data = new ArrayList<>();
		data.add(tipoCuidadoDTO);
		response.setData(data);
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}

}
