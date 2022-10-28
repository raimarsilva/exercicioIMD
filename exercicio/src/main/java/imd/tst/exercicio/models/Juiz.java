package imd.tst.exercicio.models;

import java.io.Serializable;

<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> ffc153636a6061c6a692abf1dcce009555cd355c
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "tb_juiz")
public class Juiz implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdvogado;

	@Column(nullable = false)
	private String nome;
	
	@ManyToMany(targetEntity = Juiz.class)
    private java.util.Set<Juiz> composicao;

}
