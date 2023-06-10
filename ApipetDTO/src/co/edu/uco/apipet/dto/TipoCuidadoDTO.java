package co.edu.uco.apipet.dto;

import java.util.UUID;

public class TipoCuidadoDTO {
	
	private UUID codigo;
	private String nombreTipoCuidado;
	private String descripcion;
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public String getNombreTipoCuidado() {
		return nombreTipoCuidado;
	}
	public void setNombreTipoCuidado(String nombreTipoCuidado) {
		this.nombreTipoCuidado = nombreTipoCuidado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
