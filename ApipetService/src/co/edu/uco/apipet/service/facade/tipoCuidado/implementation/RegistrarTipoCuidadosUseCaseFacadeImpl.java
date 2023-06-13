package co.edu.uco.apipet.service.facade.tipoCuidado.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.service.domain.TipoCuidadoDomain;
import co.edu.uco.apipet.service.facade.tipoCuidado.RegistrarTipoCuidadosUseCaseFacade;
import co.edu.uco.apipet.service.mapper.MapperDTOToDomain;
import co.edu.uco.apipet.service.usecase.tipoCuidado.RegistrarTipoCuidado;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrarTipoCuidadosUseCaseFacadeImpl implements RegistrarTipoCuidadosUseCaseFacade{

	@Autowired
	private RegistrarTipoCuidado registrarTipoCuidado;
	
	@Override
	public void execute(TipoCuidadoDTO dto) {
		// TODO Auto-generated method stub
		try {
			MapperDTOToDomain<TipoCuidadoDTO, TipoCuidadoDomain> mapperDTOToDomain = new MapperDTOToDomain<>();
			TipoCuidadoDomain tipocuidadoDomain = mapperDTOToDomain.mapToDomain(dto, TipoCuidadoDomain.class);
			registrarTipoCuidado.execute(tipocuidadoDomain);
		}catch (ServiceCustomException serviceCustomException) {
			throw serviceCustomException;
		}catch (Exception exception) {
			throw ServiceCustomException.createTechnicalException(exception, "Ocurrio un error implementando el caso de uso registrarTipoCuidado");
		}
	}

}
