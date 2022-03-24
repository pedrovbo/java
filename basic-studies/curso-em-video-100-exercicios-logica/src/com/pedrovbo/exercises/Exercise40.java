package com.pedrovbo.exercises;

/**
 * Crie um aplicativo que mostre na tela a seguinte contagem: 
0 3 6 9 12 15 18 Acabou! 
 */
public class Exercise40 {
    public static void main(String[] args) {
        int aux = 0;

        while(aux <= 18){

            System.out.print(aux + " ");
            
            aux += 3;
        }

        System.out.print("Acabou!");
    }
}
