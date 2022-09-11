package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imd.tst.exercicio.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}