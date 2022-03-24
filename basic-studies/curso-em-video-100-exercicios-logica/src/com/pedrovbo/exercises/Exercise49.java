package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia 6 números inteiros e no final mostre quantos deles 
são pares e quantos são ímpares.
 */
public class Exercise49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pares = 0, numero = 0, aux = 6, impares = 0;

        while(aux > 0){

            System.out.print("Digite um numero: ");
            numero = in.nextInt();

            if(numero % 2 == 0)
                pares++;
            else
                impares++;



            aux--;
        }
        System.out.println("Pares: " + pares + "\nImpares: " + impares);

        in.close();
    }
    
}
