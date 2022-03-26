package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
 * vai parar quando for digitada a idade 999. No final, mostre quantos alunos
 * existem na turma e qual é a média de idade do grupo.
 */
public class Exercise58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = 0;
        float quantidadeAlunos = 0f, somaIdade = 0f;

        while (idade != 999) {
            System.out.println("Digite a idade do aluno: ");
            idade = in.nextInt();

            if (idade != 999) {
                somaIdade += idade;
                quantidadeAlunos++;
            }

        }
        System.out.println("Quantidade de alunos na turma: " + quantidadeAlunos);
        System.out.printf("Media de idade do grupo: %.2f %n", (somaIdade/quantidadeAlunos));

        in.close();
    }
}
