package co.edu.uco.apipet.service.mapper;

import org.modelmapper.ModelMapper;

public class MapperToEntity <D,E> {

	 private static final ModelMapper mapper = new ModelMapper();

	    public E mapToEntity(D domain, Class<E> entity){
	        return mapper.map(domain, entity);
	    }
}
