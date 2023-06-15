package co.edu.uco.apipet.dto.builder.tipoCuidado;

import java.util.UUID;

public interface TipoCuidadoBuilder {
	
	TipoCuidadoBuilder setCodigo (final UUID codigo);
	TipoCuidadoBuilder setNombreTipoCuidado (final String nombreTipoCuidado);
	TipoCuidadoBuilder setDescripcion (final String descripcion);

}
