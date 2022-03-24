package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float width, height;

        System.out.println("Enter the width: ");
        width = reader.nextFloat();
        System.out.println("Enter the height: ");
        height = reader.nextFloat();

        System.out.println("The area to be painted is " + (width * height));
        System.out.println("The amount of paint needed will be " + ((width * height)/2));
        reader.close();

    }
}
