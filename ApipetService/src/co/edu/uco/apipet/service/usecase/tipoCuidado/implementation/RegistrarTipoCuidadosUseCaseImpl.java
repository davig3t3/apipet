package co.edu.uco.apipet.service.usecase.tipoCuidado.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.entity.TipoCuidadoEntity;
import co.edu.uco.apipet.repository.TipoCuidadoRepository;
import co.edu.uco.apipet.service.domain.TipoCuidadoDomain;
import co.edu.uco.apipet.service.mapper.MapperToEntity;
import co.edu.uco.apipet.service.specification.tipoCuidado.TipoCuidadoSpecification;
import co.edu.uco.apipet.service.usecase.tipoCuidado.RegistrarTipoCuidado;
import jakarta.persistence.PersistenceException;

@Service
public class RegistrarTipoCuidadosUseCaseImpl implements RegistrarTipoCuidado{

	@Autowired
	private TipoCuidadoRepository repository;
	
	@Autowired
	private TipoCuidadoSpecification specification;
	@Override
	public void execute(TipoCuidadoDomain domain) {
		
		try {
			specification.isSatisfied(domain);
			MapperToEntity<TipoCuidadoDomain, TipoCuidadoEntity> mapperToEntity = new MapperToEntity<>();
			TipoCuidadoEntity entity = mapperToEntity.mapToEntity(domain, TipoCuidadoEntity.class);
			repository.save(entity);
		}catch(ServiceCustomException exception) {
			throw ServiceCustomException.createUserException(exception.getUserMessage());
		}catch (PersistenceException exception) {
			throw ServiceCustomException.wrapException(exception.getMessage(), ServiceCustomException.createUserException("Ocurrio un error guardando la especie"));
		}
	}

}
