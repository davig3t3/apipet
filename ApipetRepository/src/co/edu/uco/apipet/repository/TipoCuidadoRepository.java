package co.edu.uco.apipet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.apipet.entity.TipoCuidadoEntity;

@Repository
public interface TipoCuidadoRepository extends JpaRepository<TipoCuidadoEntity, UUID>{

}
