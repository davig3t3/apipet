package co.edu.uco.apipet.service.specification.especie.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.isDefaultUUID;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.repository.EspecieRepository;
import co.edu.uco.apipet.service.domain.EspecieDomain;
import co.edu.uco.apipet.service.specification.especie.EspecieSpecification;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.isEmpty;

@Service
public class EspecieSpecificationImpl implements EspecieSpecification{
	
	@Autowired
	EspecieRepository repository;

	@Override
	public void isSatisfied(EspecieDomain data) {
		
		if(repository.findById(data.getCodigo()).isPresent()) {
			//Hacer execepciones
			throw ServiceCustomException.createTechnicalException("La especie ya existe en la base de datos");
		}
		
		if(!verifyEspecieAtributes(data)) {
			//Hacer Excepciones
			throw ServiceCustomException.createTechnicalException("Los atributos de la especie son invalidos ó están vacios");
		}
		
	}
	
	private boolean verifyEspecieAtributes(EspecieDomain domain) {
		return !isDefaultUUID(domain.getCodigo()) && !isEmpty(domain.getNombreEspecie()) && !isEmpty(domain.getDescripcion());
	}

}


