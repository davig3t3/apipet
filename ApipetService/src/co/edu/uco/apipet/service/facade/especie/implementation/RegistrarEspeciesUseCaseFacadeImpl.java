package co.edu.uco.apipet.service.facade.especie.implementation;

import org.springframework.stereotype.Service;

import co.edu.uco.apipet.dto.EspecieDTO;
import co.edu.uco.apipet.service.facade.especie.RegistrarEspeciesUseCaseFacade;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrarEspeciesUseCaseFacadeImpl implements RegistrarEspeciesUseCaseFacade{

	@Override
	public void execute(EspecieDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
