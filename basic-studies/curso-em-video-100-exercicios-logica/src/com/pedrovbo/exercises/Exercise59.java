package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
 * perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
 * a) qual é a maior idade lida
 * b) quantos homens foram cadastrados
 * c) qual é a idade da mulher mais jovem
 * d) qual é a média de idade entre os homens
 */
public class Exercise59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sexo;
        int idade, maiorIdade = 0, idadeMulherJovem = 0, idadeHomens = 0;
        float homensCadastrados = 0;
        char continuar = 'S';

        while (continuar == 'S') {
            System.out.println("Digite seu sexo: M/F");
            sexo = in.next();
            System.out.println("Digite sua idade: ");
            idade = in.nextInt();

            if(idade > maiorIdade)
                maiorIdade = idade;

            if(sexo.toUpperCase().contentEquals("M")){
                homensCadastrados++;
                idadeHomens += idade;
            } else if(sexo.toUpperCase().contentEquals("F")){
                if(idadeMulherJovem == 0 || idadeMulherJovem > idade){
                    idadeMulherJovem = idade;
                }
            }

            System.out.println("Continuar cadastrando? S/N");
            continuar = in.next().toUpperCase().charAt(0);            
        }

        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Homens cadastrados: " + homensCadastrados);
        System.out.println("Idade mulher mais jovem: " + idadeMulherJovem);
        System.out.printf("Media de idade homens: %.2f %n", (idadeHomens / homensCadastrados));
        in.close();
    }
}
