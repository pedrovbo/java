package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
 * No final, mostre quais são os números pares que foram digitados e em que
 * posições eles estão armazenados.
 */
public class Exercise79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            
            if(numeros[i] % 2 == 0)
                System.out.println(numeros[i] + " eh um numero par e esta na posicao " + i);
            
        }

        in.close();
    }
}
