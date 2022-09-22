package imd.tst.exercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import imd.tst.exercicio.models.Usuario;
import imd.tst.exercicio.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarPeloId(Long id){
        if(usuarioRepository.findById(id).isPresent()) {

            return usuarioRepository.findById(id).get();
        }else{
            return null;
        }

    }

    public Usuario atualizar(Long id, Usuario usuario){    	
    	return (usuarioRepository.findById(id).isPresent()) ? usuarioRepository.save(usuario) : null;
    }

    public boolean deletarPeloId(Long id){
        if(usuarioRepository.findById(id).isPresent()){
        	usuarioRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
	
}
