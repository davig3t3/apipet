package co.edu.uco.apipet.dto.builder.especie.impl;

import java.util.UUID;

import co.edu.uco.apipet.dto.EspecieDTO;
import co.edu.uco.apipet.dto.builder.especie.EspecieBuilder;

public class EspecieBuilderImpl implements EspecieBuilder{
	
	private UUID codigo;
	private String nombre_especie;
	private String descripcion;

	private EspecieBuilderImpl() {
		super();
	}
	
	public static EspecieBuilderImpl getBuilderImpl() {
		return new EspecieBuilderImpl();
	}
	
	@Override
	public final EspecieBuilder setCodigo(final UUID codigo) {
		this.codigo = codigo;
		return this;
	}

	@Override
	public final EspecieBuilder setNombreEspecie(final String nombreEspecie) {
		this.nombre_especie = nombreEspecie;
		return this;
	}

	@Override
	public final EspecieBuilder setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
	
	public EspecieDTO build() {
		return EspecieDTO.create(codigo, nombre_especie, descripcion);
	}

}
