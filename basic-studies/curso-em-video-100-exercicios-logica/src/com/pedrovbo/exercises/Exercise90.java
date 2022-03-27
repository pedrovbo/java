package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Somador() que vai calcular e mostrar a soma entre 
eles. 
 */
public class Exercise90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Digite o primeiro valor: ");
        numero1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        numero2 = in.nextInt();

        Somador(numero1, numero2);
        
        in.close();
    }

    static void Somador(int valor1, int valor2){
        System.out.println(valor1 + " + " + valor2 + " = " + (valor1+valor2));
    }
}
