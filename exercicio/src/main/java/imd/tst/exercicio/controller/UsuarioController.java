package imd.tst.exercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@Autowired
	UsuarioService usuarioService;
	
	//caminho para cadastrar um novo usuário:
	@PostMapping(path = "/usuario")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuario));
	}

}
