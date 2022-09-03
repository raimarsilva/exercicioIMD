package imd.tst.exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import imd.tst.exercicio.models.Processo;
import imd.tst.exercicio.services.ProcessoService;

@SpringBootApplication
public class ExercicioApplication {
	
	
	static ProcessoService ps;

	public static void main(String[] args) {
		
		
		Processo processo = Processo.builder().id(1L).numero("P12345").orgaoJudic("7a turma").relator("Emanoel").build();
		
		//System.out.println(processo.toString());
		System.out.println(ps.salvar(processo));
		SpringApplication.run(ExercicioApplication.class, args);
	}

}
