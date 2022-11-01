package imd.tst.exercicio.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicio.security.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByLogin(String login);
}
