package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imd.tst.exercicio.models.Advogado;


@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long>{

}
