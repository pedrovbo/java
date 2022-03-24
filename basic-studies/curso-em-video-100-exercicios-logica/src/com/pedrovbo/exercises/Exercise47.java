package com.pedrovbo.exercises;

/**
 *  Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0 
 */
public class Exercise47 {
    public static void main(String[] args) {
        int soma = 0, aux = 500;
        
        while(aux >= 0){
            if(aux == 0){
                System.out.print(aux);
            }else{
                System.out.print(aux  + " + ");
            }
            
            aux -= 50;
            soma += aux;
        }

        System.out.println("\nTotal da Soma: " + soma);
    }
}
