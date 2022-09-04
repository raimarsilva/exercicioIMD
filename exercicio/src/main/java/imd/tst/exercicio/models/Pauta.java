package imd.tst.exercicio.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Set;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Builder;
import lombok.Data;

@Builder @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
// Anotações lombok
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

}
