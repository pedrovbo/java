package com.pedrovbo.exercises;

/**
 * Faça um algoritmo que mostre na tela a seguinte contagem: 
10 9 8 7 6 5 4 3 Acabou!
 */
public class Exercise39 {
    public static void main(String[] args) {
        int aux = 10;
        while(aux >= 3){
            System.out.print(aux + " ");
            
            aux--;
        }
        System.out.print("Acabou!");
    }
}
