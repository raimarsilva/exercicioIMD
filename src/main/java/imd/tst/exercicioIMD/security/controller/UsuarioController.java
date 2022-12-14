package imd.tst.exercicioIMD.security.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import imd.tst.exercicioIMD.security.dto.CredenciaisDTO;
import imd.tst.exercicioIMD.security.dto.TokenDTO;
import imd.tst.exercicioIMD.security.entities.Usuario;
import imd.tst.exercicioIMD.security.exceptions.SenhaInvalidaException;
import imd.tst.exercicioIMD.security.services.JwtService;
import imd.tst.exercicioIMD.security.services.UsuarioServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioServiceImpl usuarioService;

	private final PasswordEncoder passwordEncoder;

	private final JwtService jwtService;

	@PostMapping("/criar")
	@Operation(summary = "Criar um novo usu?rio")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario salvar(@RequestBody @Valid Usuario usuario) {
		String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(senhaCriptografada);
		return usuarioService.salvar(usuario);
	}

	@PostMapping("/auth")
	@Operation(summary = "Obter o token com login e senha")
	public TokenDTO autenticar(@RequestBody CredenciaisDTO credenciais) {
		try {
			Usuario usuario = Usuario.builder().login(credenciais.getLogin()).senha(credenciais.getSenha()).build();
			String token = jwtService.gerarToken(usuario);
			return new TokenDTO(usuario.getLogin(), token);
		} catch (UsernameNotFoundException | SenhaInvalidaException e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
		}
	}
}
