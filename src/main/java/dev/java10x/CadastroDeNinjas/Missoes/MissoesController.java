package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Get = requisição para mostrar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissaoId(@PathVariable Long id) {
        return missoesService.listarMissaoId(id);
    }

    // Post = requisição para criar as missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissao(missao);
    }

    // Put = requisição para alterar as missoes
    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missaoAtualizado){
        return missoesService.alterarMissao(id, missaoAtualizado);
    }

    // Delete = requisição para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoId(@PathVariable Long id){
        missoesService.deletarMissaoId(id);
    }

}
