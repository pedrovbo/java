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
public class Exercise60 {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int idade, qtdHomemMaisTrinta = 0, qtdMulherMenosDezoito = 0, idadePessoaMaisVelha = 0,
                idadeMulherMaisJovem = 100, qtdPessoasCadastradas = 0;
        String nome, nomePessoaMaisVelha = "", nomeMulherMaisJovem = "";
        float mediaIdadeGrupo = 0f;
        String sexo;
        char continuar;
        boolean continua = false;

        do {
            System.out.println("##### Bem-vindo ao cadastro de pessoas #####");
            // CADASTRO PESSOA
            System.out.println("Digite nome da pessoa: ");
            nome = reader.next();
            System.out.println("Digite a idade: ");
            idade = reader.nextInt();
            System.out.println("Digite o sexo: H -> Homem / M -> Mulher");
            sexo = reader.next();

            // VERIFICA PESSOA MAIS VELHA
            if (idade > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idade;
                nomePessoaMaisVelha = nome;
            }

            // VERIFICA MULHER MAIS JOVEM
            if (sexo.toUpperCase().contentEquals("M") && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade;
                nomeMulherMaisJovem = nome;
            }

            // AUXILIA O CÁLCULO DA MEDIA DE IDADE DO GRUPO
            mediaIdadeGrupo += idade;
            qtdPessoasCadastradas++;

            // VERIFICA QUANTOS HOMENS TEM MAIS DE 30 ANOS
            if (sexo.toUpperCase().contentEquals("H") && idade > 30) {
                qtdHomemMaisTrinta++;
            }
            // VERIFICA QUANTAS MULHERES TEM MENOS DE 18 ANOS
            if (sexo.toUpperCase().contentEquals("M") && idade < 18) {
                qtdMulherMenosDezoito++;
            }

            // CONTINUAR CADASTRO?
            System.out.println("##### Continuar cadastrando? S/N #####");
            continuar = reader.next().toUpperCase().charAt(0);
            if (continuar == 'S') {
                continua = true;
            } else if (continuar == 'N') {
                continua = false;
            }

            //LIMPAR TELA DO CONSOLE
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } while (continua);

        // SAÍDA DE DADOS
        System.out.println("##### SAIDA DE DADOS #####");
        System.out.println("O nome da pessoa mais velha: " + nomePessoaMaisVelha);
        System.out.println("O nome da mulher mais jovem: " + nomeMulherMaisJovem);
        System.out.println("A media de idade do grupo: " + ((mediaIdadeGrupo) / qtdPessoasCadastradas));
        System.out.println(qtdHomemMaisTrinta + " homem(s) tem mais de 30 anos.");
        System.out.println(qtdMulherMenosDezoito + " mulher(es) tem menos de 18 anos.");

        reader.close();

        
    }
}
