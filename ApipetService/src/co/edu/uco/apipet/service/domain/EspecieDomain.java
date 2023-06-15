package co.edu.uco.apipet.service.domain;

import java.util.UUID;

public class EspecieDomain {
	
	UUID codigo;
	String nombre_especie;
	String descripcion;
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(final UUID codigo) {
		this.codigo = codigo;
	}
	public String getNombreEspecie() {
		return nombre_especie;
	}
	public void setNombreEspecie(final String nombreEspecie) {
		this.nombre_especie = nombreEspecie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
