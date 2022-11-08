package imd.tst.exercicioIMD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicioIMD.models.Pauta;
import imd.tst.exercicioIMD.repository.PautaRepository;

@Service
public class PautaService {
	
    @Autowired
    PautaRepository pautaRepository;
    
    public Pauta salvar(Pauta pauta){
    	return pautaRepository.save(pauta);
    }

    public List<Pauta> listarTodos(){
        return pautaRepository.findAll();
    }

    public Pauta buscarPeloId(Long id){
        if(pautaRepository.findById(id).isPresent()) {

            return pautaRepository.findById(id).get();
        }else{
            return null;
        }

    }

    public Pauta atualizar(Long id, Pauta pauta){    	
    	return (pautaRepository.findById(id).isPresent()) ? pautaRepository.save(pauta) : null;
    }

    public boolean deletarPeloId(Long id){
        if(pautaRepository.findById(id).isPresent()){
            pautaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
    
}

