package co.edu.uco.apipet.api.controller.especie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apipet.dto.EspecieDTO;
import co.edu.uco.apipet.service.facade.especie.RegistrarEspeciesUseCaseFacade;

@RestController
@RequestMapping("apipet/api/v1/especie")


public class RegistrarEspecieController {
	
	@Autowired
	private RegistrarEspeciesUseCaseFacade facade;
	
	@PostMapping("/registrarespecie")
	public ResponseEntity<String> execute(@RequestBody EspecieDTO especieDTO){
		facade.execute(especieDTO);
		return new ResponseEntity<>("Exito",HttpStatus.ACCEPTED);
	}
	

}
