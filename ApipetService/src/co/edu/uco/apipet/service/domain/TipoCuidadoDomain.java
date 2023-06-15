package co.edu.uco.apipet.service.domain;

import java.util.UUID;

public class TipoCuidadoDomain {
	
	private UUID codigo;
	private String nombre_tipo_cuidado;
	private String descripcion;
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public String getNombreTipoCuidado() {
		return nombre_tipo_cuidado;
	}
	public void setNombreTipoCuidado(String nombreTipoCuidado) {
		this.nombre_tipo_cuidado = nombreTipoCuidado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
