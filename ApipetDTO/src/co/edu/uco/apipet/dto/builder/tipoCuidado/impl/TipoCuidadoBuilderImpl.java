package co.edu.uco.apipet.dto.builder.tipoCuidado.impl;

import java.util.UUID;

import co.edu.uco.apipet.dto.builder.tipoCuidado.TipoCuidadoBuilder;

public class TipoCuidadoBuilderImpl implements TipoCuidadoBuilder{
	
	private UUID codigo;
	private String nombreTipoCuidado;
	private String descripcion;

	@Override
	public TipoCuidadoBuilder setCodigo(UUID codigo) {
		this.codigo = codigo;
		return this;
	}

	@Override
	public TipoCuidadoBuilder setNombreTipoCuidado(String nombreTipoCuidado) {
		this.nombreTipoCuidado = nombreTipoCuidado;
		return this;
	}

	@Override
	public TipoCuidadoBuilder setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
	
}
