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

import imd.tst.exercicio.services.OrgaoService;
import imd.tst.exercicio.models.Orgao;
import imd.tst.exercicio.models.dto.*;;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
public class OrgaoController {

    @Autowired
    OrgaoService orgaoService;


    // Rota para salvar
    @PostMapping(path = "/orgao")
    @Operation(summary = "Salvar novo órgão", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Orgao> salvar(@RequestBody CadastrarOrgaoDTO orgaoDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(orgaoService.salvar(orgaoDTO));
    }

    // Rota para listar todos
    @GetMapping(path = "/orgaos")
    @Operation(summary = "Listar todos os órgãos", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<List<Orgao>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(orgaoService.listarTodos());
    }

    // Rota para buscar pelo id
    @GetMapping(path = "/orgao/{id}")
    @Operation(summary = "Buscar órgão pelo id", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Orgao> buscarPeloId(@PathVariable Long id){
        Orgao orgao = orgaoService.buscarPeloId(id);
        if(orgao != null){
            return ResponseEntity.status(HttpStatus.OK).body(orgao);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(orgao);
        }
    }

    // Rota para Deletar
    @DeleteMapping(path = "/orgao/{id}")
    @Operation(summary = "Deletar orgão pelo id", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<?> deletarPeloId(@PathVariable Long id){
        if(orgaoService.deletarPeloId(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
    }

    // Rota para Atualizar
    @PatchMapping(path = "/orgao/{id}")
    @Operation(summary = "Atualizar órgão", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<Orgao> atualizar(@PathVariable Long id, @RequestBody Orgao orgao){
        Orgao orgaoAtualizado = orgaoService.atualizar(id, orgao);
        if(orgaoAtualizado != null){
            return ResponseEntity.status(HttpStatus.OK).body(orgaoAtualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(orgaoAtualizado);
        }
    }
}
