package com.pedrovbo;

import com.pedrovbo.exercicio1.Pessoa;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Lista de Exercícios POO");

        Pessoa p = new Pessoa();
        p.setDataNascimento("30/03/1989");
        p.setNome("Pedro");
        p.setAltura(1.73f);
        System.out.println(p);


    }
}
