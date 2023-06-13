package co.edu.uco.apipet.dto.builder.especie.impl;

import java.util.UUID;

import co.edu.uco.apipet.dto.builder.especie.EspecieBuilder;

public class EspecieBuilderImpl implements EspecieBuilder{
	
	private UUID codigo;
	private String nombreEspecie;
	private String descripcion;

	@Override
	public EspecieBuilder setCodigo(UUID codigo) {
		this.codigo = codigo;
		return this;
	}

	@Override
	public EspecieBuilder setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
		return this;
	}

	@Override
	public EspecieBuilder setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

}
