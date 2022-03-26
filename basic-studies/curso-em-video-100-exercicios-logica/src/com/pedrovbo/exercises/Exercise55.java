package com.pedrovbo.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
 * agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
 * tentativas para tentar acertar.
 */
public class Exercise55 {
    public static void main(String[] args) {
        boolean jogando = true;
        int aux = 4, numero, palpite;
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        numero = rand.nextInt(10) + 1;

        while (jogando) {
            
            System.out.println("Advinhe um numero de 1-10...");
            palpite = reader.nextInt();

            if (numero == palpite) {
                System.out.println("Parabens voce acertou o numero!!");
                jogando = false;
            } else {
                System.out.println("Voce errou...");
                System.out.println("Voce tem mais " + aux + " tentativas!");
            }

            if(aux == 0){
                jogando = false;
            }
            
            aux--;
        }

        System.out.println("##### FIM DE JOGO #####");
        reader.close();
    }
}
