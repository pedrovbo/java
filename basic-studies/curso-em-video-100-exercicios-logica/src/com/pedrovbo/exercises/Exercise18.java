package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int yearOfBirth;

        System.out.println("Enter your year of birth: ");
        yearOfBirth = reader.nextInt();

        if((2022 - yearOfBirth) < 16)
            System.out.println("You still can't vote!");
        else
            System.out.println("Good vote!");
        reader.close();
    }   
    
}
