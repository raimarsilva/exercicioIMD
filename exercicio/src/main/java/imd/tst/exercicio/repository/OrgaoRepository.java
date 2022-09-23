package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import imd.tst.exercicio.models.Orgao;

@Repository
public interface OrgaoRepository extends JpaRepository<Orgao, Long> {

    // @Transactional
    // @Modifying
    // @Query(value = "DELETE FROM tb_vinculacao WHERE id_advogado = ?1", nativeQuery = true)
    // public void deletarAdvogadoVinculado(Long id);

}
