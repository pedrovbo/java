package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie uma lógica que leia um número inteiro e passe para um procedimento 
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como 
parâmetro é PAR ou ÍMPAR.
 */
public class Exercise92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        System.out.print("Digite o numero:");
        numero = in.nextInt();

        ParOuImpar(numero);

        in.close();
    }

    static void ParOuImpar(int numero){
        if(numero % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }

}
