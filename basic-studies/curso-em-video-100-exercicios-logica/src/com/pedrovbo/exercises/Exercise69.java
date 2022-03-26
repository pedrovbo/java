package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
 * PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA
 * e
 * a soma entre todos os valores da sequência.
 */
public class Exercise69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, razaoPA, soma = 0, aux = 0;

        System.out.print("Digite o primeiro termo da PA: ");
        numero = in.nextInt();
        System.out.print("Digite a razao da PA: ");
        razaoPA = in.nextInt();

        System.out.println();

        System.out.print("Dez primeiros elementos da PA: ");
        for (int i = numero; aux < 10; i += razaoPA) {
            System.out.print(i + " ");
            soma += i;
            aux++;
        }
        System.out.println("\nSoma de todos os termos: " + soma);
        in.close();
    }
}
