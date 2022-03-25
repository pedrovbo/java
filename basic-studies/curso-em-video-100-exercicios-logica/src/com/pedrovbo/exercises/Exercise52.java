package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final: 
 a) Qual é a média de idade do grupo 
 b) Quantas pessoas tem mais de 18 anos 
 c) Quantas pessoas tem menos de 5 anos 
 d) Qual foi a maior idade lida
 */
public class Exercise52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = 0, media = 0, aux = 0, maisDezoito = 0, menosCinco = 0, maiorIdade = 0;

        while(aux < 10){
            System.out.println("Digite sua idade: ");
            idade = in.nextInt();

            media += idade;
            if(idade > 18)
                maisDezoito++;
            if(idade < 5)
                menosCinco++;

            if(idade > maiorIdade)
                maiorIdade = idade;

            aux++;
        }

        System.out.println("Idade media do grupo: " + (media/10));
        System.out.println("Mais de 18: " + maisDezoito);
        System.out.println("Menos de 5: " + menosCinco);
        System.out.println("Maior idade: " + maiorIdade);

        in.close();
    }
}
