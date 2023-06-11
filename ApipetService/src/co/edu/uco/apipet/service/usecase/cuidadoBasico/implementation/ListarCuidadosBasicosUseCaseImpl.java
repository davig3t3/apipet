package co.edu.uco.apipet.service.usecase.cuidadoBasico.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uco.apipet.service.domain.CuidadoBasicoDomain;
import co.edu.uco.apipet.service.usecase.cuidadoBasico.ListarCuidadosBasicos;

@Service
public class ListarCuidadosBasicosUseCaseImpl implements ListarCuidadosBasicos{

	@Override
	public List<CuidadoBasicoDomain> execute(Optional<CuidadoBasicoDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
