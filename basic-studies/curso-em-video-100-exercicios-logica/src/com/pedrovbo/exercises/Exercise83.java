package com.pedrovbo.exercises;

import java.util.Random;

/**
 * [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números 
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os 
números gerados e depois coloque o vetor em ordem crescente, mostrando no final 
os valores ordenados.
 */
public class Exercise83 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[20];
        int aux = 0;

        System.out.println("Ordem de insercao: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(99);
        }
        for (int i : numeros) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < (numeros.length-1); j++) {
                if(numeros[j] > numeros[j + 1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("Ordem crescente: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }

        
    }
}
