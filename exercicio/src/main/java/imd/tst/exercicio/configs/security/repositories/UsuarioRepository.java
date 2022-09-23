package imd.tst.exercicio.configs.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicio.configs.security.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByLogin(String login);
}
