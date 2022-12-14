package imd.tst.exercicioIMD.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
// Anotações lombok
@AllArgsConstructor
@NoArgsConstructor
@Data
// Anotações JPA
@Entity @Table(name = "TB_PAUTA")
public class Pauta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pauta"/* , insertable = false, updatable = false */)
    private Long id;
    
    @Column(nullable = false) @DateTimeFormat(style = "SS")
    private Date data;
    
    @OneToMany(targetEntity = Processo.class)
    private java.util.Set<Processo> processos;

    @ManyToOne(targetEntity = Orgao.class)
    @JoinColumn(name="id")
    private Orgao orgao;
}
