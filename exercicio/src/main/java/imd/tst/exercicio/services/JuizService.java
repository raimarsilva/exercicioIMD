package imd.tst.exercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicio.repository.JuizRepository;

import java.util.List;



import imd.tst.exercicio.models.Juiz;


@Service
public class JuizService {

    @Autowired
    JuizRepository juizRepository;

    public List<Juiz> listarTodos(){
        return juizRepository.findAll();
    }
    
}
