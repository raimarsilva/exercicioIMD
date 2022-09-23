package imd.tst.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
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

    //Rota para buscar pelo id
    @GetMapping(path = "/juiz/{id}")
    public ResponseEntity<Juiz> buscarPeloId(@PathVariable Long id){
        Juiz juiz = juizService.buscarPeloId(id);
        if(juiz != null){
            System.out.println(juiz.toString());
            return ResponseEntity.status(HttpStatus.OK).body(juiz);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(juiz);
        }
    }

    // Rota para Atualizar
    @PatchMapping(path = "/juiz/{id}")
    public ResponseEntity<Juiz> atualizar(@PathVariable Long id, @RequestBody Juiz juiz){
        Juiz juizAtualizado = juizService.atualizar(id, juiz);
        if(juizAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body(juizAtualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(juizAtualizado);
        }
    }
    
}
