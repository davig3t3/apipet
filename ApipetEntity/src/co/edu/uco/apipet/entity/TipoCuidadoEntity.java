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
@Table (name = "tipo_cuidado")
public class TipoCuidadoEntity {

	@Id
	UUID codigo;
	String nombre_tipo_cuidado;
	String descripcion;
}
