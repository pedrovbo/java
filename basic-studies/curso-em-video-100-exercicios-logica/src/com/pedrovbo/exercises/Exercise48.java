package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia 7 números inteiros e no final mostre o somatório 
entre eles.
 */
public class Exercise48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0, numero = 0, aux = 7;

        while(aux > 0){

            System.out.print("Digite um numero: ");
            numero = in.nextInt();

            soma += numero;

            aux--;
        }
        System.out.println("Total da Soma: " + soma);

        in.close();
    }
}
