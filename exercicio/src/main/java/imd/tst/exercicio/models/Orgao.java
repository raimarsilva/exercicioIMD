package imd.tst.exercicio.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Entity @Table(name = "TB_ORGAO")
public class Orgao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_orgao"/* , insertable = false, updatable = false */)
    private Long id;

    @Column(nullable = false)
	private String nome;
    
    @OneToMany(targetEntity = Pauta.class)
    private java.util.Set<Pauta> pautas;
    
    @ManyToOne(targetEntity = Juiz.class)
    private Juiz presidente;

    @ManyToMany(targetEntity = Juiz.class)
    private java.util.Set<Juiz> composicao;
}
