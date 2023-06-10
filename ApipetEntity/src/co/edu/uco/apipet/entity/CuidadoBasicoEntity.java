package co.edu.uco.apipet.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "cuidado_basico")
public class CuidadoBasicoEntity {
	
	@Id
	private UUID codigo;
	@ManyToOne
	@JoinColumn(name = "tipo_cuidado")
	private TipoCuidadoEntity tipoCuidado;
	@ManyToOne
	@JoinColumn(name = "especie")
	private EspecieEntity especie;
	private String nombre;
	private String descripcion;
	private String duracion;
	private String recomendaciones;
	private String restricciones;

}
