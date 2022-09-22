package imd.tst.exercicio.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicio.models.Usuario;
import imd.tst.exercicio.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
}
