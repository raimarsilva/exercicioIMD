package imd.tst.exercicioIMD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicioIMD.models.Advogado;
import imd.tst.exercicioIMD.repository.AdvogadoRepository;

@Service
public class AdvogadoService {
	
	@Autowired
    AdvogadoRepository advogadoRepository;
    
    public Advogado salvar(Advogado processo){
    	return advogadoRepository.save(processo);
    }

    public List<Advogado> listarTodos(){
        return advogadoRepository.findAll();
    }

    public Advogado buscarPeloId(Long id){
        if(advogadoRepository.findById(id).isPresent()) {

            return advogadoRepository.findById(id).get();
        }else{
            return null;
        }

    }
    
    public Advogado buscarPeloNome(String nome) {
		return advogadoRepository.findByNome(nome).get();
	}

    public Advogado atualizar(Long id, Advogado advogado){    	
    	return (advogadoRepository.findById(id).isPresent()) 
    			? advogadoRepository.save(advogado) : null;
    }

    public boolean deletarPeloId(Long id){
        if(advogadoRepository.findById(id).isPresent()){
        	advogadoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

	

}
