package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
 * o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float speed;
        
        System.out.println("Enter your car speed: ");
        speed = reader.nextFloat();

        if(speed > 80)
            System.out.println("Speeding above the allowed, you've been fined");
        reader.close();
        
    }
    
}
