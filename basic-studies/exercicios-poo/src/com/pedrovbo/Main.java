package com.pedrovbo;

import com.pedrovbo.exercicio1.Pessoa;
import com.pedrovbo.exercicio2.Agenda;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Lista de Exercícios POO");

        Pessoa p = new Pessoa();

        Agenda a = new Agenda();

        //p.setDataNascimento("30/03/1989");
        p.setNome("Pedro");
        p.setAltura(1.73f);
        p.setDataNascimento(33);
        System.out.println(p);

        a.armazenaPessoas("Pedro", 33, 1.73f);
        a.armazenaPessoas("Alice", 5, 1.73f);
        a.armazenaPessoas("Robson", 34, 1.73f);
        a.armazenaPessoas("Lua", 33, 1.73f);
        a.armazenaPessoas("Gessica", 30, 1.73f);
        a.armazenaPessoas("Katarine", 30, 1.73f);
        a.armazenaPessoas("Marina", 22, 1.73f);
        a.armazenaPessoas("Thiago", 13, 1.73f);
        a.armazenaPessoas("José", 89, 1.73f);
        a.armazenaPessoas("Ana", 59, 1.73f);
        a.armazenaPessoas("Teste", 67, 1.73f);

        System.out.println();

        a.removePessoa("Pedro");
        System.out.println(a.buscaPessoa("Gessica"));

        a.imprimeAgenda();

        a.imprimePessoa(0);




        //System.out.println(a.getPessoas());
        //a.armazenaPessoas("Alexa", 33, 1.73f);


    }
}
