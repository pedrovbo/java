package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um programa que leia uma distância em metros e mostre os valores
 * relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185.72
 * A distância de 85.7m corresponde a:
 * 0.18572Km                1857.2dm
 * 1.8572Hm                 18572.0cm
 * 18.572Dam                185720.0mm
 *
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double distancia;

        System.out.println("Enter a distance in meters: ");
        distancia = reader.nextDouble();

        System.out.println((distancia/1000) + "Km");
        System.out.println((distancia/100) + "Hm");
        System.out.println((distancia/10) + "Dam");
        System.out.println((distancia*10) + "dm");
        System.out.println((distancia*100) + "cm");
        System.out.println((distancia*1000) + "mm");
        reader.close();

    }
}
