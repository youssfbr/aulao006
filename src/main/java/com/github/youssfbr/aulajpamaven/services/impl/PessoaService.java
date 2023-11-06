package com.github.youssfbr.aulajpamaven.services.impl;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;
import com.github.youssfbr.aulajpamaven.services.IPessoaService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
@Service
public class PessoaService implements IPessoaService {
    private final HibernatePersistenceProvider provider = new HibernatePersistenceProvider();
    private final EntityManagerFactory emf = provider.createEntityManagerFactory("com.github.youssfbr.aulajpamaven", null);
    private final EntityManager em = emf.createEntityManager();
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void createPessoa(Pessoa pessoa) {

        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();

        logger.info("Pessoa salva com sucesso.");
    }
}
