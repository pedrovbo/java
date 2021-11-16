package com.exercises.loops;

import java.util.Scanner;

/*
* Faça um programa que leia 5 números e
* informe o maior número e a média desses
* números.
*/
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        double maiorNumero = 0;
        double[] numero = new double[5];
        int contador = 0;


        while (contador < 5){
            System.out.println("Digite um número: ");
            numero[contador] = leia.nextDouble();
            soma += numero[contador];
            maiorNumero = numero[contador];
            if(maiorNumero > numero[contador]){
                maiorNumero = numero[contador];
            }
            contador++;
        }

        media = soma/5;

        System.out.println("A média dos números digitados é: " + media);
        System.out.println("O maior número digitado foi: " + maiorNumero);











    }
}
