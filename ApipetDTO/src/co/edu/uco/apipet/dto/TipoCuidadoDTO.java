package co.edu.uco.apipet.dto;

import java.util.UUID;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.getDefaultUUID;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.EMPTY;

public class TipoCuidadoDTO {
	
	UUID codigo;
	String nombre_tipo_cuidado;
	String descripcion;
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(final UUID codigo) {
		this.codigo = codigo;
	}
	public String getNombreTipoCuidado() {
		return nombre_tipo_cuidado;
	}
	public void setNombreTipoCuidado(final String nombreTipoCuidado) {
		this.nombre_tipo_cuidado = nombreTipoCuidado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	/*public TipoCuidadoDTO() {
		setCodigo(getDefaultUUID());
		setNombreTipoCuidado(EMPTY);
		setDescripcion(EMPTY);
	}
	
	public TipoCuidadoDTO(final UUID codigo, final String nombreTipoCuidado, final String descripcion) {
		setCodigo(codigo);
		setNombreTipoCuidado(nombreTipoCuidado);
		setDescripcion(descripcion);
	}
	
	public static final TipoCuidadoDTO create(final UUID codigo, final String nombreTipoCuidado, final String descripcion) {
		return new TipoCuidadoDTO(codigo,nombreTipoCuidado, descripcion);
	}
	
	public static final TipoCuidadoDTO create(final UUID codigo) {
		return new TipoCuidadoDTO(codigo, EMPTY, EMPTY);
	}
	
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
	*/
	

}
