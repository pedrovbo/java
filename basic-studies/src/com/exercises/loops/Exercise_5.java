package com.exercises.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        Scanner lerChar = new Scanner(System.in);
        int quantidadeNumero, contador = 0, numero, somaPar = 0, somaImpar = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumero = lerNumero.nextInt();
        do {
            System.out.println("Digite um número: ");
            numero = lerNumero.nextInt();

            if (numero % 2 == 0) somaPar++;
            else somaImpar++;

            contador++;
        } while (contador < quantidadeNumero);

        System.out.println("Total de números pares digitados: " + somaPar
                + "\nTotal de números ímpares digitados: " + somaImpar);

        System.out.println("Fim do Programa");
    }
}
