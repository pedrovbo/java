package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 *A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
public class Exercise14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double distancia;
        int dias;
        // $ 90 dia
        // $ 0.20 km rodado

        System.out.println("How many kilometers were travelled? ");
        distancia = reader.nextDouble();
        System.out.println("How many days did you have the car? ");
        dias = reader.nextInt();

        System.out.println("Total car rental price is R$ " + ((dias * 90) + (distancia * 0.20)));
        reader.close();

    }
}
