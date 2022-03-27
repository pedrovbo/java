package com.pedrovbo.exercises;

/**
 * Crie um programa que melhore o procedimento Gerador() da questão anterior
 * para que o programador possa escolher uma entre três bordas:
 * 
 * +-------=======------+ Borda 1
 * ~~~~~~~~:::::::~~~~~~~ Borda 2
 * <<<<<<<<------->>>>>>> Borda 3
 * 
 * Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
 * ~~~~~~~~:::::::~~~~~~~
 * Portugol Studio
 * Portugol Studio
 * Portugol Studio
 * ~~~~~~~~:::::::~~~~~~~
 */
public class Exercise89 {
    public static void main(String[] args) {
        Gerador("Desenvolvedor Java", 3, 2);
    }

    static void Gerador(String frase, int repetir, int borda) {

        String bordas;
        if (borda == 1) {
            bordas = "+-------=======------+";
        } else if (borda == 2) {
            bordas = "~~~~~~~~:::::::~~~~~~~";
        } else if (borda == 3) {
            bordas = "<<<<<<<<------->>>>>>>";
        } else {
            bordas = "";
        }

        System.out.println(bordas);
        for (int i = 0; i < repetir; i++) {
            System.out.println("  " + frase);
        }
        System.out.println(bordas);

    }

}
