package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa usando a estrutura “faça enquanto” que leia a idade de
 * várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer
 * ou
 * não continuar a digitar dados. No final, quando o usuário decidir parar,
 * mostre
 * na tela:
 * a) Quantas idades foram digitadas
 * b) Qual é a média entre as idades digitadas
 * c) Quantas pessoas tem 21 anos ou mais.
 */
public class Exercise62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade, vinteUm = 0;
        float contaIdade = 0f, somaIdade = 0f;
        char continuar;
        do {
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();

            if (idade >= 21)
                vinteUm++;

            somaIdade += idade;
            contaIdade++;

            System.out.println("Deseja continuar? S/N");
            continuar = in.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        System.out.println("Idades digitadas: " + contaIdade);
        System.out.printf("Media das idades: %.2f %n", (somaIdade / contaIdade));
        System.out.println("Pessoas com 21 anos ou mais: " + vinteUm);

        in.close();

    }
}
