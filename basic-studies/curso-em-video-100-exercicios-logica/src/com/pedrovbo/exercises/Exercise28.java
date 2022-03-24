package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
devemostrar a classificação desse terreno, de acordo com a lista abaixo: 
   - Abaixo de 100m² = TERRENO POPULAR 
   - Entre 100m² e 500m² = TERRENO MASTER 
   - Acima de 500m² = TERRENO VIP 
 */
public class Exercise28 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float width, height, area;

        System.out.println("Enter the width value: m²");
        width = reader.nextFloat();
        System.out.println("Enter the height value: m²");
        height = reader.nextFloat();

        area = width * height;
        
        if(area < 100)
            System.out.println("Popular Terrain");
        else if(area >= 100 && area < 500)
            System.out.println("Master Terrain");
        else if(area >= 500)
            System.out.println("VIP Terrain");
        reader.close();
    }
}
