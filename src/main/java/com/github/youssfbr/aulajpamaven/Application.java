package com.github.youssfbr.aulajpamaven;

import com.github.youssfbr.aulajpamaven.services.IPessoaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private final IPessoaService pessoaService;

    public Application(IPessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Pessoa p1 = new Pessoa(null, "Alisson Youssf", "youssfbr@gmail.com");
//        Pessoa p2 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//        Pessoa p4 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
//
//        pessoaService.createPessoa(p1);
//        pessoaService.createPessoa(p2);
//        pessoaService.createPessoa(p3);
//        pessoaService.createPessoa(p4);

    }
}
