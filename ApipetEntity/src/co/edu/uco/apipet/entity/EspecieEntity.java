package co.edu.uco.apipet.entity;

import java.util.UUID;

import jakarta.persistence.Column;
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
	@Column(name = "codigo")
	UUID codigo;

	@Column(name = "nombre_especie")
	String nombre_especie;

	@Column(name = "descripcion")
	String descripcion;
}
