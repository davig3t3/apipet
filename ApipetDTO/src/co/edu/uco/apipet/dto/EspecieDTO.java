package co.edu.uco.apipet.dto;

import java.util.UUID;
import static co.edu.uco.apipet.crosscutting.helper.UUIDHelper.getDefaultUUID;
import static co.edu.uco.apipet.crosscutting.helper.StringHelper.EMPTY;

public class EspecieDTO {
	
	UUID codigo;
	String nombre_especie;
	String descripcion;
	
	public EspecieDTO() {
		setCodigo(getDefaultUUID(codigo));
		setNombreEspecie(EMPTY);
		setDescripcion(EMPTY);
	}
	
	public EspecieDTO(final UUID codigo, final String nombreEspecie, final String descripcion) {
		setCodigo(codigo);
		setNombreEspecie(nombreEspecie);
		setDescripcion(descripcion);
	}
	
	public static EspecieDTO create(final UUID codigo, final String nombreEspecie, final String descripcion) {
		return new EspecieDTO(codigo, nombreEspecie, descripcion);
	}
	
	public static final EspecieDTO create(final UUID codigo) {
		return new EspecieDTO(codigo,EMPTY, EMPTY);
	}
	
	
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
	/*public EspecieDTO() {
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
		return nombre_especie;
	}
	public void setNombreEspecie(String nombreEspecie) {
		this.nombre_especie = nombreEspecie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}*/
	
	

}
