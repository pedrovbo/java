package com.pedrovbo.exercises;

/**
 * Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
 * “faça enquanto”
 * 0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */
public class Exercise61 {
    public static void main(String[] args) {
        
        int aux = 0;

        do{
            System.out.print(aux + " ");
            aux += 3;
        } while(aux <= 30);

        System.out.print("Acabou!");
    }
}
