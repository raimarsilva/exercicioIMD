package imd.tst.exercicioIMD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicioIMD.models.Processo;
import imd.tst.exercicioIMD.repository.ProcessoRepository;

@Service
public class ProcessoService {
	
    @Autowired
    ProcessoRepository processoRepository;
    
    public Processo salvar(Processo processo){
    	return processoRepository.save(processo);
    }

    public List<Processo> listarTodos(){
        return processoRepository.findAll();
    }

    public Processo buscarPeloId(Long id){
        if(processoRepository.findById(id).isPresent()) {

            return processoRepository.findById(id).get();
        }else{
            return null;
        }

    }

    public Processo atualizar(Long id, Processo processo){    	
    	return (processoRepository.findById(id).isPresent()) ? processoRepository.save(processo) : null;
    }

    public boolean deletarPeloId(Long id){
        if(processoRepository.findById(id).isPresent()){
            processoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }



}
