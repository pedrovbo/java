package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
 * a) Quantos homens foram cadastrados
 * b) Quantas mulheres foram cadastradas
 * c) A média de idade do grupo
 * d) A média de idade dos homens
 * e) Quantas mulheres tem mais de 20 anos
 */
public class Exercise53_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = 0, aux = 0, homens = 0, mulheres = 0, mediaGrupo = 0, mediaHomens = 0, mulheresMaisVinte = 0;
        String sexo;

        while (aux < 5) {
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
            System.out.print("Digite seu sexo (M/F): ");
            sexo = in.next();

            if (sexo.toUpperCase().contentEquals("M")) {
                homens++;
                mediaHomens += idade;
            } else if (sexo.toUpperCase().contentEquals("F")) {
                mulheres++;
                if(idade > 20)
                    mulheresMaisVinte++;
            }
            mediaGrupo += idade;

            aux++;
        }

        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);
        System.out.printf("Media grupo: %.2f %n", (((float) mediaGrupo) / 5));
        System.out.printf("Media homens: %.2f %n", (((float) mediaHomens) / homens));
        System.out.println("Mulheres com mais de 20: " + mulheresMaisVinte);

        in.close();
    }
}
