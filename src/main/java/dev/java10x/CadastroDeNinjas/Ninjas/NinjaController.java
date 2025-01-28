package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é a minha primeira mensagem";
    }

    // Adicionar Ninja (Create)
    @PostMapping("/adicionar-ninja")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar Ninja por ID (Read)
    @GetMapping("/mostar-ninja-id")
    public String mostrarNinja() {
        return "Mostrar Ninja pelo id";
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/todos-ninjas")
    public String mostrarTodosNinjas() {
        return "Todos os Ninjas";
    }

    // Alterar dados dos Ninjas (Update)
    @PutMapping("/atualizar-ninja-id")
    public String atualizarNinja() {
        return "Atualizar Ninja por id";
    }

    // Deletar Ninja (Delete)
    @DeleteMapping("/deletar-ninja-id")
    public String deletarNinja() {
        return "Ninja Deletado por id";
    }

}
