package com.pedrovbo.exercise21;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Pedro", "Rua Java, 77", "00011122233382");
        List<Livro> acervo = new ArrayList<Livro>();

        acervo.add(new Livro("Harry Potter", 2000, 400, "Fantasia", "JK Rowling"));
        acervo.add(new Livro("Senhor dos Anéis", 1980, 900, "Fantasia", "JRR Tolkien"));
        acervo.add(new Livro("Eu, Robô", 1950, 350, "Ficção Científica", "Isaac Asimov"));
        acervo.add(new Livro("Guia do Mochileiro das Galáxias", 1989, 320, "Ficção Científica", "Douglas Adams"));
        acervo.add(new Livro("O Andarilho", 1999, 430, "Fantasia", "Bernard Cornwell"));
        acervo.add(new Livro("O Nome do Vento", 2002, 450, "Fantasia", "Patrick Rothfuss"));
        acervo.add(new Livro("O Temor do Sábio", 2004, 480, "Fantasia", "Patrick Rothfuss"));
        acervo.add(new Livro("Espadachim de Carvão", 2010, 290, "Fantasia", "Affonso Solano"));
        acervo.add(new Livro("The Complete Robot", 1990, 999, "Ficção Científica", "Isaac Asimov"));
        acervo.add(new Livro("A Política", 1999, 380, "Filosofia", "Aristóteles"));

        Emprestimo e = new Emprestimo();
        e.setAcervoLivros(acervo);

        p.fazerEmprestimo(e,"The Complete Robot");

        System.out.println(e.buscarLivro("O nome do vento"));

        System.out.println(e.getAcervoLivros());

        System.out.println("Deseja pegar um livro emprestado? ");

    }
}
