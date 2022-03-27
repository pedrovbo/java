package com.pedrovbo.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um 
número (chave) e seu programa deve mostrar em que posições essa chave foi 
encontrada. Mostre também quantas vezes a chave foi sorteada.
 */
public class Exercise80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        int chave, contChave = 0;
        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(15)+1;
    
        }

        System.out.println("Digite um numero chave: ");
        chave = in.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] == chave) {
                System.out.print("\nA chave " + chave + " foi encontrada na posicao: " + i);
                contChave++;
            }
        }

        System.out.println("\nA chave foi sorteada " + contChave + " vezes.");
        in.close();

    }
}
