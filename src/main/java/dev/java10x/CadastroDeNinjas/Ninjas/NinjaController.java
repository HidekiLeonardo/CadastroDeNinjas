package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é a minha primeira mensagem";
    }

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/listar-ninja-id")
    public String mostrarNinja() {
        return "Mostrar Ninja pelo id";
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/listar")
    public String mostrarTodosNinjas() {
        return "Todos os Ninjas";
    }

    // Alterar dados dos Ninjas (Update)
    @PutMapping("/alterar")
    public String atualizarNinja() {
        return "Atualizar Ninja por id";
    }

    // Deletar Ninja (Delete)
    @DeleteMapping("/deletar")
    public String deletarNinja() {
        return "Ninja Deletado por id";
    }

}
