package com.pedrovbo.exercises;

/**
 * Crie um programa que melhore o procedimento Gerador() da questão anterior
 * para que mostre uma mensagem vário
 * Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
 * +-------=======------+
 * Aprendendo Portugol
 * Aprendendo Portugol
 * Aprendendo Portugol
 * Aprendendo Portugol
 * +-------=======------+
 */
public class Exercise88 {
    public static void main(String[] args) {
        Gerador("Desenvolvedor Java", 5);
    }

    static void Gerador(String frase, int repetir) {

        System.out.println("+-------=======------+");
        for (int i = 0; i < repetir; i++) {
            System.out.println("  " + frase);
        }
        System.out.println("+-------=======------+");

    }
}
