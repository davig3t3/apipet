package co.edu.uco.apipet.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "especie")
public class EspecieEntity {

	@Id
	private UUID codigo;
	private String nombreEspecie;
	private String descripcion;
}
