package co.edu.uco.apipet.service.usecase.especie.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.entity.EspecieEntity;
import co.edu.uco.apipet.repository.EspecieRepository;
import co.edu.uco.apipet.service.domain.EspecieDomain;
import co.edu.uco.apipet.service.mapper.MapperToEntity;
import co.edu.uco.apipet.service.specification.especie.EspecieSpecification;
import co.edu.uco.apipet.service.usecase.especie.RegistrarEspecie;
import jakarta.persistence.PersistenceException;

@Service
public class RegistrarEspeciesUseCaseImpl implements RegistrarEspecie{

	@Autowired
	private EspecieRepository repository;
	
	@Autowired
	private EspecieSpecification specification;
	
	@Override
	public void execute(EspecieDomain domain) {
		// TODO Auto-generated method stub
		try {
			specification.isSatisfied(domain);
			MapperToEntity<EspecieDomain, EspecieEntity> mapper = new MapperToEntity<>();
			EspecieEntity especieEntity = mapper.mapToEntity(domain, EspecieEntity.class);
			repository.save(especieEntity);
		}catch(ServiceCustomException exception) {
			throw ServiceCustomException.createUserException(exception.getUserMessage());
		}catch (PersistenceException exception) {
			throw ServiceCustomException.wrapException(exception.getMessage(), ServiceCustomException.createUserException("Ocurrio un error guardando la especie"));
		}
	}

}
