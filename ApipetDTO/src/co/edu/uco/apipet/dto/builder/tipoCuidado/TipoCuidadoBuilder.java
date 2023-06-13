package co.edu.uco.apipet.dto.builder.tipoCuidado;

import java.util.UUID;

public interface TipoCuidadoBuilder {
	
	TipoCuidadoBuilder setCodigo (UUID codigo);
	TipoCuidadoBuilder setNombreTipoCuidado (String nombreTipoCuidado);
	TipoCuidadoBuilder setDescripcion (String descripcion);

}
