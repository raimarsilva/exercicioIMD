package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import imd.tst.exercicio.models.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM tb_vinculacao WHERE id_advogado = ?1", nativeQuery = true)
    public void deletarAdvogadoVinculado(Long id);

}
