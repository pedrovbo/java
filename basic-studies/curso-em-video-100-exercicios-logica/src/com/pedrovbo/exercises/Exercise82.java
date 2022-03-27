package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
 * um vetor. No final, mostre:
 * a) Qual é a média da turma
 * b) Quantos alunos estão acima da média da turma
 * c) Qual foi a maior nota digitada
 * d) Em que posições a maior nota aparece
 */
public class Exercise82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] notas = new float[10];
        float media = 0f, maiorNota = 0f;
        String maiorPosicoes = "";
        int acimaMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = in.nextFloat();

            media += notas[i];

            if (maiorNota < notas[i])
                maiorNota = notas[i];
        }

        media /= notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maiorNota)
                maiorPosicoes += i + " ";
            if(notas[i] > media)
                acimaMedia++;
        }

        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println(acimaMedia + " alunos acima da media da turma");
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("A maior nota aparece na(s) posicoe(s): " + maiorPosicoes);
        in.close();
    }
}
