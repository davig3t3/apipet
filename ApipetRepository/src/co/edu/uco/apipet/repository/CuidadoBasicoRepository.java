package co.edu.uco.apipet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.apipet.entity.CuidadoBasicoEntity;

@Repository
public interface CuidadoBasicoRepository extends JpaRepository<CuidadoBasicoEntity, UUID>{

}
