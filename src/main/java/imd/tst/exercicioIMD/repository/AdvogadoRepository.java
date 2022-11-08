package imd.tst.exercicioIMD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imd.tst.exercicioIMD.models.Advogado;


@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long>{
	
	Optional<Advogado> findByNome(String nome);

}
