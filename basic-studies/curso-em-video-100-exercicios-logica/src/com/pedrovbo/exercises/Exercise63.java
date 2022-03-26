package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa usando a estrutura “faça enquanto” que leia vários números.
 * A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
 * tela:
 * a) O somatório entre todos os valores
 * b) Qual foi o menor valor digitado
 * c) A média entre todos os valores
 * d) Quantos valores são pares
 */
public class Exercise63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char continuar;
        int numero, menor = 0, pares = 0;
        float soma = 0f, quantidade = 0f;
        do {
            System.out.print("Digite um numero: ");
            numero = in.nextInt();

            if (menor == 0 || numero < menor)
                menor = numero;

            if (numero % 2 == 0)
                pares++;

            soma += numero;
            quantidade++;
            System.out.println("Deseja continuar? S/N ");
            continuar = in.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        System.out.println("a) O somatório entre todos os valores " + soma);
        System.out.println("b) Qual foi o menor valor digitado " + menor);
        System.out.println("c) A média entre todos os valores " + (soma / quantidade));
        System.out.println("d) Quantos valores são pares " + pares);

        in.close();
    }
}
