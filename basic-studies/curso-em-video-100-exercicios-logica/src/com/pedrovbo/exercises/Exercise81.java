package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
 * final, mostre:
 * a) Qual é a média de idade das pessoas cadastradas
 * b) Em quais posições temos pessoas com mais de 25 anos
 * c) Qual foi a maior idade digitada (podem haver repetições)
 * d) Em que posições digitamos a maior idade
 */
public class Exercise81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] idade = new int[3];
        int maiorIdade = 0;
        float media = 0f;
        String maisVinteCinco = "", maiorIdadePosicoes = "";

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite sua idade: ");
            idade[i] = in.nextInt();
        }

        for (int i = 0; i < idade.length; i++) {

            media += idade[i];

            if(idade[i] > 25)
                maisVinteCinco += "\nA idade: " + idade[i] + " esta na posicao: " + i;
            

            if(maiorIdade < idade[i])
                maiorIdade = idade[i];                
        }

        for (int i = 0; i < idade.length; i++) {
            if(idade[i] == maiorIdade)
                maiorIdadePosicoes += "\nA maior idade: " + maiorIdade + " foi encontrada na posicao: " + i;
        }

        System.out.printf("a) Qual é a média de idade das pessoas cadastradas: \n%.2f%n", (media/idade.length));
        System.out.println("b) Em quais posições temos pessoas com mais de 25 anos: " + maisVinteCinco);
        System.out.println("c) Qual foi a maior idade digitada (podem haver repetições): \n" + maiorIdade);
        System.out.println("d) Em que posições digitamos a maior idade: " + maiorIdadePosicoes);

        in.close();
    }
}
