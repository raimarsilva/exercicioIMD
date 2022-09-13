package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imd.tst.exercicio.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}