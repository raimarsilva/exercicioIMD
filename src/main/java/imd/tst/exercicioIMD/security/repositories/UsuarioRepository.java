package imd.tst.exercicioIMD.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import imd.tst.exercicioIMD.security.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByLogin(String login);
}
