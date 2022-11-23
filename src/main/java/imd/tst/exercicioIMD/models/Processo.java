package imd.tst.exercicioIMD.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
// Anotações lombok
@AllArgsConstructor
@NoArgsConstructor
@Data
// Anotações JPA
@Entity @Table(name = "TB_PROCESSO")
public class Processo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_processo", insertable = false, updatable = false)
    private Long id;
	
	@Column(nullable = false)
    private String numero;
	
	//Confirmar se essa propriedade é necessária no processo ou se pode ser recuperada da pauta.
    //private String orgaoJudic;
	
    @ManyToOne(targetEntity = Juiz.class)
    @JsonManagedReference
    private Juiz relator;
    
    @ManyToOne(targetEntity = Pauta.class)
    @JoinColumn(name="id")
    @JsonBackReference
    private Pauta pauta;
    
    @Column
    private String resumo;

}
