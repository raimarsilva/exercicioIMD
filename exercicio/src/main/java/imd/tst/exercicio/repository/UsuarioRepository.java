package imd.tst.exercicio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicio.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByLogin(String login);
}
