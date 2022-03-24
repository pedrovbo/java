package com.pedrovbo.exercises;

/**
 * Escreva um programa que mostre na tela a seguinte contagem:  
    6 7 8 9 10 11 Acabou!
 */
public class Exercise38 {
    public static void main(String[] args) {
        int aux = 6;

        while(aux <= 11){
            
            System.out.print(aux + " ");            
            aux++;
        }
        System.out.print("Acabou!");
        
    }
}
