package imd.tst.exercicio.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicio.models.Juiz;

public interface JuizRepository extends JpaRepository<Juiz, Long>{
    
    

}
