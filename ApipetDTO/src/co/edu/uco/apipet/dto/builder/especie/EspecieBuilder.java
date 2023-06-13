package co.edu.uco.apipet.dto.builder.especie;

import java.util.UUID;

public interface EspecieBuilder {
	
	EspecieBuilder setCodigo(UUID codigo);
	EspecieBuilder setNombreEspecie (String nombreEspecie);
	EspecieBuilder setDescripcion(String descripcion);

}
