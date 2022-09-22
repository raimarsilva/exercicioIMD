package imd.tst.exercicio.controller;

import java.util.List;

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

import imd.tst.exercicio.models.Usuario;
import imd.tst.exercicio.services.UsuarioService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/api")
public class UsuarioController {
	
	final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	//caminho para cadastrar um novo usuário:
	@PostMapping(path = "/usuario")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuario));
	}
	
	// Rota para listar todos
    @GetMapping(path = "/usuarios")
    public ResponseEntity<List<Usuario>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listarTodos());
    }

    // Rota para buscar pelo id
    @GetMapping(path = "/usuario/{id}")
    public ResponseEntity<Usuario> buscarPeloId(@PathVariable Long id){
    	Usuario processo = usuarioService.buscarPeloId(id);
        if(processo != null){
            return ResponseEntity.status(HttpStatus.OK).body(processo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(processo);
        }
    }

    // Rota para Deletar
    @DeleteMapping(path = "/usuario/{id}")
    public ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        if(usuarioService.deletarPeloId(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
    }

    // Rota para Atualizar
    @PatchMapping(path = "/usuario/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
    	Usuario usuarioAtualizado = usuarioService.atualizar(id, usuario);
        if(usuarioAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioAtualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(usuarioAtualizado);
        }
    }

}
