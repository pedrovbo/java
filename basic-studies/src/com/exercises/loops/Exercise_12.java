package com.exercises.loops;

/*
 * Faça um laço FOR que mostre os números de 3 até 11, iterando de 2 em 2.
 * Entretanto, quando o loop passar pelo 7, este não deve ser exibido.*/
public class Exercise_12 {
    public static void main(String[] args) {

        for (int i = 3; i <= 11; i += 2) {
            if(i == 7){

            } else {
                System.out.println("Valor do laço: " + i);
            }


        }
    }
}
