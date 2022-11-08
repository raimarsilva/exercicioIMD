package imd.tst.exercicio.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imd.tst.exercicio.repository.OrgaoRepository;
import imd.tst.exercicio.models.Juiz;
import imd.tst.exercicio.models.Orgao;
import imd.tst.exercicio.models.Pauta;
import imd.tst.exercicio.models.dto.*;

@Service
public class OrgaoService {
	
    @Autowired
    OrgaoRepository orgaoRepository;

    @Autowired
    PautaService pautaService;

    @Autowired
    JuizService juizService;
    
    public Orgao salvar(CadastrarOrgaoDTO orgaoDTO){
        Orgao orgao = new Orgao();
        ArrayList<Pauta> pautasParaAdicionar = new ArrayList<Pauta>();
        ArrayList<Juiz> composicaoParaAdicionar = new ArrayList<Juiz>();
        for (Long pauta : orgaoDTO.getPautasIds()) {
            pautasParaAdicionar.add(pautaService.buscarPeloId(pauta));
        };
        for (Long juiz : orgaoDTO.getComposicaoIds()) {
            composicaoParaAdicionar.add(juizService.buscarPeloId(juiz));
        };
        orgao.setNome(orgaoDTO.getNome());
        orgao.setPautas(new HashSet<>(pautasParaAdicionar));
        orgao.setComposicao(new HashSet<>(composicaoParaAdicionar));
        orgao.setPresidente(juizService.buscarPeloId(orgaoDTO.getPresidenteId()));
    	return orgaoRepository.save(orgao);
    }

    public List<Orgao> listarTodos(){
        return orgaoRepository.findAll();
    }

    public Orgao buscarPeloId(Long id){
        if(orgaoRepository.findById(id).isPresent()) {

            return orgaoRepository.findById(id).get();
        }else{
            return null;
        }

    }

    public Orgao atualizar(Long id, Orgao pauta){    	
    	return (orgaoRepository.findById(id).isPresent()) ? orgaoRepository.save(pauta) : null;
    }

    public boolean deletarPeloId(Long id){
        if(orgaoRepository.findById(id).isPresent()){
            orgaoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
    
}

