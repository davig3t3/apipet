package co.edu.uco.apipet.service.domain;

import java.util.UUID;


public class CuidadoBasicoDomain {

	private UUID codigo;
	private TipoCuidadoDomain tipoCuidado;
	private EspecieDomain especie;
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
	public TipoCuidadoDomain getTipoCuidado() {
		return tipoCuidado;
	}
	public void setTipoCuidado(TipoCuidadoDomain tipoCuidado) {
		this.tipoCuidado = tipoCuidado;
	}
	public EspecieDomain getEspecie() {
		return especie;
	}
	public void setEspecie(EspecieDomain especie) {
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
