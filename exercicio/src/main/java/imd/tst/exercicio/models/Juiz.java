package imd.tst.exercicio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "tb_juiz")
public class Juiz implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String registro;

}
