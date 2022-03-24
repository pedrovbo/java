package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
 */
public class Exercise22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int yearOfBirth;

        System.out.println("Enter your year of birth: ");
        yearOfBirth = reader.nextInt();

        if((2022-yearOfBirth) >= 18){

            System.out.println("Ready for enlistment for " + Math.abs(((2022 - yearOfBirth) - 18)) + " years");
        } else
            System.out.println("Not ready to enlist " + Math.abs(((2022 - yearOfBirth) - 18)) + " years to go..." );

        reader.close();
    }
}
