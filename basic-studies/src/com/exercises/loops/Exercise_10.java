package com.exercises.loops;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Exercise_10 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100);
        }

        System.out.println("Números aleatórios gerados: ");
        for (int i: numeros
             ) {
            System.out.print(i + " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int i: numeros
             ) {
            System.out.print((i+1)+ " ");
        }



    }
}
