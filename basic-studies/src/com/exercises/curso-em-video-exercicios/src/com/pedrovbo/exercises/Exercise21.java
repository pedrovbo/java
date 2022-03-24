package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
 */
public class Exercise21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int year;

        System.out.println("Enter a year: ");
        year = reader.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            
            System.out.println("The year entered is a leap year!");
            
        } else
            System.out.println("The year entered is not a leap year!");

        reader.close();
    }
}