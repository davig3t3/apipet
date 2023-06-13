package co.edu.uco.apipet.service.specification.tipoCuidado.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.isDefaultUUID;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.isEmpty;

import co.edu.uco.apipet.crosscutting.exceptions.service.ServiceCustomException;
import co.edu.uco.apipet.repository.TipoCuidadoRepository;
import co.edu.uco.apipet.service.domain.TipoCuidadoDomain;
import co.edu.uco.apipet.service.specification.tipoCuidado.TipoCuidadoSpecification;

@Service
public class TipoCuidadoSpecificationImpl implements TipoCuidadoSpecification{
	
	@Autowired
	TipoCuidadoRepository repository;

	@Override
	public void isSatisfied(TipoCuidadoDomain data) {
		if(repository.findById(data.getCodigo()).isPresent()) {
			throw ServiceCustomException.createTechnicalException("El tipo de cuidado ya existe en la base de datos");
		}
		
		if(!verifyTipoCuidadoAtributes(data)) {
			throw ServiceCustomException.createTechnicalException("Los atributos del tipo de cuidado son invalidos ó están vacios");
		}
		
	}
	
	private boolean verifyTipoCuidadoAtributes(TipoCuidadoDomain domain) {
		return !isDefaultUUID(domain.getCodigo()) && !isEmpty(domain.getNombreTipoCuidado()) && !isEmpty(domain.getDescripcion());
	}

}
