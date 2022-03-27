package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um programa que leia 15 números e guarde-os em um vetor. No final, 
mostre o vetor inteiro na tela e em seguida mostre em que posições foram 
digitados valores que são múltiplos de 10.
 */
public class Exercise78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero: ");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 10 == 0)
                System.out.println("Multiplo de 10: " + numeros[i] +" encontra-se na posicao: " + i);
        }

        in.close();
    }
}
