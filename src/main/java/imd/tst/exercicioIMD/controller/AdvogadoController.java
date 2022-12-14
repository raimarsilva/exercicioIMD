package imd.tst.exercicioIMD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imd.tst.exercicioIMD.models.Advogado;
import imd.tst.exercicioIMD.services.AdvogadoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api")
public class AdvogadoController {

	@Autowired
	AdvogadoService advogadoService;

	// Rota para salvar
	@PostMapping(path = "/advogado")
	@Operation(summary = "Salvar advogado", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<Advogado> salvar(@RequestBody Advogado advogado) {
		return ResponseEntity.status(HttpStatus.CREATED).body(advogadoService.salvar(advogado));
	}

	// Rota para listar todos os advogados.
	@GetMapping(path = "/advogados")
	@Operation(summary = "Listar todos os advogados", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<List<Advogado>> listarTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(advogadoService.listarTodos());
	}

	// Rota para buscar pelo id
	@GetMapping(path = "/advogado/{id}")
	@Operation(summary = "Buscar advogado pelo id", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<Advogado> buscarPeloId(@PathVariable Long id) {
		Advogado advogado = advogadoService.buscarPeloId(id);
		if (advogado != null) {
			System.out.println(advogado.toString());
			return ResponseEntity.status(HttpStatus.OK).body(advogado);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(advogado);
		}
	}

	// Rota para buscar pelo nome do advogado.
	@GetMapping(path = "/advogado/nome/{nome}")
	@Operation(summary = "Buscar advogado pelo nome", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<Advogado> buscarPeloNome(@PathVariable String nome) {
		Advogado advogado = advogadoService.buscarPeloNome(nome);
		if (advogado != null) {
			System.out.println(advogado.toString());
			return ResponseEntity.status(HttpStatus.OK).body(advogado);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(advogado);
		}
	}

	// Rota para Deletar
	@DeleteMapping(path = "/advogado/{id}")
	@Operation(summary = "Deletar advogado pelo id", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<?> deletarPeloId(@PathVariable Long id) {
		if (advogadoService.deletarPeloId(id)) {
			return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("N??o encontrado");
		}
	}

	// Rota para Atualizar
	@PatchMapping(path = "/advogado/{id}")
	@Operation(summary = "Atualizar advogado", security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<Advogado> atualizar(@PathVariable Long id, @RequestBody Advogado advogado) {
		Advogado advogadoAtualizado = advogadoService.atualizar(id, advogado);
		if (advogadoAtualizado != null) {
			return ResponseEntity.status(HttpStatus.OK).body(advogadoAtualizado);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(advogadoAtualizado);
		}
	}
}
