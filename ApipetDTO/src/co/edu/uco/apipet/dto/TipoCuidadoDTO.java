package co.edu.uco.apipet.dto;

import java.util.UUID;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.getDefaultUUID;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.EMPTY;

public class TipoCuidadoDTO {
	
	private UUID codigo;
	private String nombreTipoCuidado;
	private String descripcion;
	
	public TipoCuidadoDTO() {
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
