package aplicacao;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Alisson Youssf", "youssfbr@gmail.com");
        Pessoa p2 = new Pessoa(2, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p3 = new Pessoa(3, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p4 = new Pessoa(4, "Ana Maria", "ana@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
