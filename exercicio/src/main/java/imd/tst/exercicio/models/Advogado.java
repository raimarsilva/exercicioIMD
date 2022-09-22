package imd.tst.exercicio.models;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "tb_advogado")
public class Advogado extends Usuario {

	private static final long serialVersionUID = 1L;
	
	private String numeroOAB;

}
