package com.pedrovbo.exercises;

import java.util.Random;

/**
 * Crie um programa que preencha automaticamente um vetor numérico com 7 
números gerados aleatoriamente pelo computador e depois mostre os valores 
gerados na tela.
 */
public class Exercise76 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(9);
            System.out.print(numeros[i] + " ");
        }

    }
}
