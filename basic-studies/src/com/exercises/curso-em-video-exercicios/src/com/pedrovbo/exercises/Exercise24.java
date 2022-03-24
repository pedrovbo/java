package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
 */
public class Exercise24 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float distance;

        System.out.println("Enter how many kilometers you want to travel: ");        
        distance = reader.nextFloat();

        if(distance <= 200)
            System.out.println("The price of your ticket will be US$ " + (distance * 0.5));
        else if (distance > 200)
            System.out.println("The price of your ticket will be US$ " + (distance * 0.45));
        reader.close();
    }
}
