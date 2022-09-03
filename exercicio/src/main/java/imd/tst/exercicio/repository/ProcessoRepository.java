package imd.tst.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import imd.tst.exercicio.models.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM tb_vinculacao WHERE id_processo = ?1", nativeQuery = true)
    public void deletarProcessoVinculado(Long id);

}
