package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é a minha primeira mensagem";
    }

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaId(@PathVariable Long id) {
        return ninjaService.listarNinjaId(id);
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Alterar dados dos Ninjas (Update)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.alterarNinja(id, ninjaAtualizado);
    }

    // Deletar Ninja (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaId(@PathVariable Long id) {
        ninjaService.deletarNinjaId(id);
    }

}
