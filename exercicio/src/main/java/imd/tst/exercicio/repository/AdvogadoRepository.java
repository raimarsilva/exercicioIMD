package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicio.models.Advogado;

public interface AdvogadoRepository extends JpaRepository<Advogado, Long>{
}
