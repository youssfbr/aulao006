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
    private static String unitName;
    private static final HibernatePersistenceProvider provider = new HibernatePersistenceProvider();
    private  EntityManagerFactory emf;
    EntityManager em;
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void createPessoa(Pessoa pessoa) {

        try {
            emf = provider.createEntityManagerFactory(unitName, null);
            em = emf.createEntityManager();

            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();


            logger.info("Pessoa salva com sucesso.");
        }
        catch (Exception e) {
            logger.warning(e.getMessage());
        }
        finally {
            em.close();
            emf.close();
        }
    }
}
