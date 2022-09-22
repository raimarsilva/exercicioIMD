package imd.tst.exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

}
