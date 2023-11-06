package com.github.youssfbr.aulajpamaven.services;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;

public interface IPessoaService {
    Pessoa findById(Long id) throws RuntimeException;
    void createPessoa(Pessoa pessoa);
}
