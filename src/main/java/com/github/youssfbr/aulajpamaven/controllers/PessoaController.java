package com.github.youssfbr.aulajpamaven.controllers;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;
import com.github.youssfbr.aulajpamaven.services.IPessoaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final IPessoaService pessoaService;

    public PessoaController(IPessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return pessoaService.findById(id);
    }

    @PostMapping
    public void createPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.createPessoa(pessoa);
    }
}
