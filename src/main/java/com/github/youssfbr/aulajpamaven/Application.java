package com.github.youssfbr.aulajpamaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.youssfbr.aulajpamaven.dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

    @Override
    public void run(String... args) throws Exception {

        Pessoa p1 = new Pessoa(null, "Alisson Youssf", "youssfbr@gmail.com");
        Pessoa p2 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p3 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p4 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.github.youssfbr.aulajpamaven");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.persist(p4);

        entityManager.getTransaction().commit();

        System.out.println("OK");
    }
}
