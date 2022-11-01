package imd.tst.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import imd.tst.exercicio.services.ProcessoService;
import imd.tst.exercicio.models.Processo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
public class ProcessoController {

    @Autowired
    ProcessoService processoService;

    // Rota para salvar
    @PostMapping(path = "/processo")
    @Operation(summary = "Salvar novo processo", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Processo> salvar(@RequestBody Processo processo){
        return ResponseEntity.status(HttpStatus.CREATED).body(processoService.salvar(processo));
    }

    // Rota para listar todos
    @GetMapping(path = "/processos")
    @Operation(summary = "Listar todos os processos", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<List<Processo>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(processoService.listarTodos());
    }

    // Rota para buscar pelo id
    @GetMapping(path = "/processo/{id}")
    @Operation(summary = "Buscar processo pelo id", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Processo> buscarPeloId(@PathVariable Long id){
        Processo processo = processoService.buscarPeloId(id);
        if(processo != null){
            return ResponseEntity.status(HttpStatus.OK).body(processo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(processo);
        }
    }

    // Rota para Deletar
    @DeleteMapping(path = "/processo/{id}")
    @Operation(summary = "Deletar processo pelo id", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        if(processoService.deletarPeloId(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
    }

    // Rota para Atualizar
    @PatchMapping(path = "/processo/{id}")
    @Operation(summary = "Atualizar processo", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Processo> atualizar(@PathVariable Long id, @RequestBody Processo processo){
        Processo processoAtualizado = processoService.atualizar(id, processo);
        if(processoAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body(processoAtualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(processoAtualizado);
        }
    }
}

