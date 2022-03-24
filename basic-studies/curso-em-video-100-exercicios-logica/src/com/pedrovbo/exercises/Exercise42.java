package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
qualquer e mostre uma contagem até esse valor: 
Ex: Digite um valor: 35 
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */
public class Exercise42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, aux = 1;
        System.out.println("Digite um numero: ");
        numero = in.nextInt();

        while(aux <= numero){
            System.out.print(aux + " ");                           
            aux++;
        }
        System.out.print("Acabou!");
        in.close();


    }
}
