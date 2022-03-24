package com.pedrovbo.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Crie um jogo onde o computador vai sortear um número entre 1 e 5 o 
    jogador vai tentar descobrir qual foi o valor sorteado.
 */
public class Exercise32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int numero, palpite;

        numero = rand.nextInt(5)+1;
        System.out.println("Advinhe um numero de 1-5...");
        palpite = reader.nextInt();

        if(numero == palpite){
            System.out.println("Parabens voce acertou o numero!!");
        } else {
            System.out.println("Voce errou...");
            System.out.println("O numero correto seria " + numero);
        }


        reader.close();
    }
}
