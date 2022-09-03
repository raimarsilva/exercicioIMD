package imd.tst.exercicio.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Builder //@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
// Anotações lombok
@Data
// Anotações JPA
@Entity @Table(name = "TB_PROCESSO")
public class Processo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
    private String numero;
	
    private String orgaoJudic;
    private String relator;
    
    @ManyToOne(targetEntity = Processo.class)
    @JoinColumn(name="id")
    private Pauta pauta;

}
