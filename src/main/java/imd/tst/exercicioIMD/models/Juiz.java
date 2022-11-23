package imd.tst.exercicioIMD.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "tb_juiz")
public class Juiz implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_juiz")
	private Long idJuiz;

	@Column(nullable = false)
	private String nome;

	@ManyToMany(mappedBy = "composicao")
	@JsonBackReference
	private java.util.Set<Orgao> orgaosQueCompoe;

}
