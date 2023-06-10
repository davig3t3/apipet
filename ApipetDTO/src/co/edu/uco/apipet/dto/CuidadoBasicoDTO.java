package co.edu.uco.apipet.dto;

import java.util.UUID;

public class CuidadoBasicoDTO {
	
	private UUID codigo;
	private TipoCuidadoDTO tipoCuidado;
	private EspecieDTO especie;
	private String nombre;
	private String descripcion;
	private String duracion;
	private String recomendaciones;
	private String restricciones;
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public TipoCuidadoDTO getTipoCuidado() {
		return tipoCuidado;
	}
	public void setTipoCuidado(TipoCuidadoDTO tipoCuidado) {
		this.tipoCuidado = tipoCuidado;
	}
	public EspecieDTO getEspecie() {
		return especie;
	}
	public void setEspecie(EspecieDTO especie) {
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public String getRestricciones() {
		return restricciones;
	}
	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
	}
	
	

}
