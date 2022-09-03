package imd.tst.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import imd.tst.exercicio.models.Pauta;
import imd.tst.exercicio.services.PautaService;
import imd.tst.exercicio.services.ProcessoService;

public class PautaController {

    @Autowired
    PautaService pautaService;

    @Autowired
    ProcessoService processoService;

    // Rota para salvar
    @PostMapping(path = "/pauta")
    public ResponseEntity<Pauta> salvar(@RequestBody Pauta pauta){
        return ResponseEntity.status(HttpStatus.CREATED).body(pautaService.salvar(pauta));
    }

    // Rota para listar todos
    @GetMapping(path = "/pautas")
    public ResponseEntity<List<Pauta>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(pautaService.listarTodos());
    }

    // Rota para buscar pelo id
    @GetMapping(path = "/pauta/{id}")
    public ResponseEntity<Pauta> buscarPeloId(@PathVariable Long id){
        Pauta pauta = pautaService.buscarPeloId(id);
        if(pauta != null){
            return ResponseEntity.status(HttpStatus.OK).body(pauta);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pauta);
        }
    }

    // Rota para Deletar
    @DeleteMapping(path = "/pauta/{id}")
    public ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        if(pautaService.deletarPeloId(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
    }

    // Rota para Atualizar
    @PatchMapping(path = "/pauta/{id}")
    public ResponseEntity<Pauta> atualizar(@PathVariable Long id, @RequestBody Pauta pauta){
        Pauta pautaAtualizado = pautaService.atualizar(id, pauta);
        if(pautaAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body(pautaAtualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pautaAtualizado);
        }
    }
}
