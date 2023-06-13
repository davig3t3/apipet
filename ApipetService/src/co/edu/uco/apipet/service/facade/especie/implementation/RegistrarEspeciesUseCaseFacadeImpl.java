package co.edu.uco.apipet.service.facade.especie.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.dto.EspecieDTO;
import co.edu.uco.apipet.service.domain.EspecieDomain;
import co.edu.uco.apipet.service.facade.especie.RegistrarEspeciesUseCaseFacade;
import co.edu.uco.apipet.service.mapper.MapperDTOToDomain;
import co.edu.uco.apipet.service.usecase.especie.RegistrarEspecie;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrarEspeciesUseCaseFacadeImpl implements RegistrarEspeciesUseCaseFacade{

	@Autowired
	private RegistrarEspecie registrarEspecie;
	@Override
	public void execute(EspecieDTO dto) {
		try {
			
			MapperDTOToDomain<EspecieDTO, EspecieDomain> mapperDTOToDomain = new MapperDTOToDomain<>();
			EspecieDomain especieDomain = mapperDTOToDomain.mapToDomain(dto, EspecieDomain.class);
			registrarEspecie.execute(especieDomain);
		}catch(ServiceCustomException serviceCustomException){
			throw serviceCustomException;
		}catch(Exception exception) {
			throw ServiceCustomException.createTechnicalException(exception, "Ocurrio un error implementando el caso de uso RegistrarEspecie");
		}
	}

}
