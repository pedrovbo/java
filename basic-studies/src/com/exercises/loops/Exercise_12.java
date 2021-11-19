package com.exercises.loops;

/*
 * Faça um laço FOR que mostre os números de 3 até 11, iterando de 2 em 2.
 * Entretanto, quando o loop passar pelo 7, este não deve ser exibido.
 *
 * Também faça um while que exiba um texto 5 vezes, com uma expressão de controle
 * e uma variável booleana
 */
public class Exercise_12 {
    public static void main(String[] args) {
        boolean valido = true;
        int contador = 0;

        for (int i = 3; i <= 11; i += 2) {
            if(i == 7){

            } else {
                System.out.println("Valor do laço: " + i);
            }
        }

        while (valido){ // ou while (contador <= 5)
            contador++;
            System.out.println("Esta é uma frase dentro de uma laço while");
            if(contador == 5){
                valido = false;
            }
        }
    }
}
