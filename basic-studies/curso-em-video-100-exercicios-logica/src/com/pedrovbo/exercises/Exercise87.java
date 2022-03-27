package com.pedrovbo.exercises;

/**
 * Crie um programa que melhore o procedimento Gerador() da questão anterior
 * para que mostre uma mensagem personalizada, passada como parâmetro.
 * Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
 * +-------=======------+
 * Aprendendo Portugol
 * +-------=======------+
 */
public class Exercise87 {
    public static void main(String[] args) {
        Gerador("Frase Qualquer");
    }

    static void Gerador(String frase) {
        System.out.println("+-------=======------+\n  " + frase + "\n+-------=======------+");
    }
}
