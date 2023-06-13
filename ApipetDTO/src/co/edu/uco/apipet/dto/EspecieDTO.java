package co.edu.uco.apipet.dto;

import java.util.UUID;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.getDefaultUUID;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.EMPTY;

public class EspecieDTO {
	
	private UUID codigo;
	private String nombreEspecie;
	private String descripcion;
	
	public EspecieDTO() {
		setCodigo(getDefaultUUID());
		setNombreEspecie(EMPTY);
		setDescripcion(EMPTY);
	}
	
	public EspecieDTO(final UUID codigo, final String nombreEspecie, final String descripcion) {
		setCodigo(codigo);
		setNombreEspecie(nombreEspecie);
		setDescripcion(descripcion);
	}
	
	public static final EspecieDTO create(final UUID codigo, final String nombreEspecie, final String descripcion) {
		return new EspecieDTO(codigo, nombreEspecie, descripcion);
	}
	
	public static final EspecieDTO create(final UUID codigo) {
		return new EspecieDTO(codigo,EMPTY, EMPTY);
	}
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
