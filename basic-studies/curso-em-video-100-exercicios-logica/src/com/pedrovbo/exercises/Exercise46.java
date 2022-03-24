package com.pedrovbo.exercises;

/**
 * Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 
8 + 10 + 12 + 14 + ... + 98 + 100.
 */
public class Exercise46 {
    public static void main(String[] args) {
        int aux = 6, soma = 0;
        while(aux <= 100){
            if(aux != 100)
                System.out.print(aux + " + ");
            else
                System.out.print(aux + ".");
            soma += aux;
            aux += 2;
        }
        
        System.out.println("\nTotal da soma: " + soma);
    }
}
