package imd.tst.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import imd.tst.exercicio.services.JuizService;
import imd.tst.exercicio.models.Juiz;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
public class JuizController {

    @Autowired
    JuizService juizService;

    //Rota para listar todos
    @GetMapping(path = "/juizes")
    public ResponseEntity<List<Juiz>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(juizService.listarTodos());
    }
    
}
