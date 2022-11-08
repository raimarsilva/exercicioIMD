package imd.tst.exercicioIMD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicioIMD.models.Juiz;
import imd.tst.exercicioIMD.repository.JuizRepository;

@Service
public class JuizService {

    @Autowired
    JuizRepository juizRepository;

    
    public List<Juiz> listarTodos(){
        return juizRepository.findAll();
    }
    
    public Juiz buscarPeloId(Long id ){
        if(juizRepository.findById(id).isPresent()){
            return juizRepository.findById(id).get();
        }else{
            return null;
        }
    }

    public Juiz atualizar(Long id, Juiz juiz){    	
    	return (juizRepository.findById(id).isPresent()) 
    			? juizRepository.save(juiz) : null;
    }
}
