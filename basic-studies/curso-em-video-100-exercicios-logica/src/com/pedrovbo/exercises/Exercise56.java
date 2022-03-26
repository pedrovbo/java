package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 *  Crie um programa que leia vários números pelo teclado e mostre no final o 
    somatório entre eles. 
    Obs: O programa será interrompido quando o número 1111 for digitado
 */
public class Exercise56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeros = 0;
        System.out.println("Digite 1111 caso deseje sair.");
        while(numeros != 1111){
            System.out.print("Digite um numero: ");
            numeros = in.nextInt();
        }

        System.out.println("O numero 1111 foi digitado, programa encerrado!");
        in.close();
    }
}
