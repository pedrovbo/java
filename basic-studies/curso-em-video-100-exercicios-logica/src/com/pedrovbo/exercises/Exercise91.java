package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Maior() que vai verificar qual deles é o maior e 
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem 
informando essa característica.
 */
public class Exercise91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro valor: ");
        numero1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        numero2 = in.nextInt();

        Maior(numero1, numero2);
        
        in.close();
    }

    static void Maior(int valor1, int valor2){
        if(valor1 > valor2)
            System.out.println(valor1 + " eh maior que " + valor2);
        else if( valor1 == valor2)
            System.out.println("Valores iguais!");
        else
        System.out.println(valor2 + " eh maior que " + valor1);
    }
}
