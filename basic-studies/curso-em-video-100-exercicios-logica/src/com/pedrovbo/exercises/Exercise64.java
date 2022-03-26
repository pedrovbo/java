package com.pedrovbo.exercises;

/**
 * Desenvolva um programa usando a estrutura “para” que mostre na tela a 
seguinte contagem: 
0 5 10 15 20 25 30 35 40 Acabou! 
 */
public class Exercise64 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 40; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");
    }
}
