package tst.trabalho.pratica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data @Entity @Table(name="tb_processos")
public class Processo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final long idProcesso=1L;
	private String numeroProcesso;
	private String relator;
	private String autor;
	private String reu;
	private Advogado advogado;

}
