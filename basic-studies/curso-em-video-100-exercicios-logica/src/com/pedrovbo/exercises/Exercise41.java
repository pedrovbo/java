package com.pedrovbo.exercises;

/**
 * Desenvolva um programa que mostre na tela a seguinte contagem: 
100 95 90 85 80 ... 0 Acabou!
 */
public class Exercise41 {
    public static void main(String[] args) {
        int aux = 100;

        while(aux >= 0){
            
            System.out.print(aux + " ");                       
            
            aux -= 5;
        }
        
        System.out.print("Acabou!"); 
    }
}
