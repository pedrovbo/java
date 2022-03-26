package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
 * O programa vai perguntar se o usuário quer ou não continuar. No final,
 * mostre:
 * a) O nome da pessoa mais velha
 * b) O nome da mulher mais jovem
 * c) A média de idade do grupo
 * d) Quantos homens tem mais de 30 anos
 * e) Quantas mulheres tem menos de 18 anos
 */
public class Exercise60_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, sexo, maisVelha = "", aMaisJovem = "";
        char continuar = 'S';
        int idade, idadeMaisVelha = 0, mulherMaisJovem = 0, homensMaisTrinta = 0,
                mulherMenosDezoito = 0;
        float somaIdade = 0f, qtdPessoas = 0f;

        while (continuar == 'S') {
            System.out.print("Digite seu nome: ");
            nome = in.next();
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
            System.out.print("Digite seu sexo (M/F): ");
            sexo = in.next();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                maisVelha = nome;
            }
            if (sexo.toUpperCase().contentEquals("F")) {
                if (mulherMaisJovem == 0 || idade < mulherMaisJovem) {
                    mulherMaisJovem = idade;
                    aMaisJovem = nome;
                }

                if (idade < 18) {
                    mulherMenosDezoito++;
                }
            } else if (sexo.toUpperCase().contentEquals("M")) {
                if (idade > 30) {
                    homensMaisTrinta++;
                }
            }

            somaIdade += idade;
            qtdPessoas++;

            System.out.println("Deseja continuar? S/N");
            continuar = in.next().toUpperCase().charAt(0);
        }

        System.out.println("Nome da pessoa mais velha: " + maisVelha);
        System.out.println("Nome mulher mais jovem: " + aMaisJovem);
        System.out.printf("Media de idade do grupo: %.2f %n", (somaIdade / qtdPessoas));
        System.out.println("Homens mais de 30: " + homensMaisTrinta);
        System.out.println("Mulheres com menos de 18: " + mulherMenosDezoito);
        in.close();
    }
}
