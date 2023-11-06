package com.github.youssfbr.aulajpamaven.controllers;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;
import com.github.youssfbr.aulajpamaven.services.IPessoaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
    private final IPessoaService pessoaService;

    public PessoaController(IPessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public void createPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.createPessoa(pessoa);
    }
}
