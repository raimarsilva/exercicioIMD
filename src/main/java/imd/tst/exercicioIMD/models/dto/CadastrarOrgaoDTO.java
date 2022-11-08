package imd.tst.exercicioIMD.models.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CadastrarOrgaoDTO {
    private String nome;
    private java.util.Set<Long> pautasIds;
    private Long presidenteId;
    private java.util.Set<Long> composicaoIds;
}
