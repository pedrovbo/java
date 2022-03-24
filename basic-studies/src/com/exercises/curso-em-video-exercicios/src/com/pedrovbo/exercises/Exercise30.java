package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado:  
   - EQUILÁTERO: todos os lados iguais 
   - ISÓSCELES: dois lados iguais 
   - ESCALENO: todos os lados diferentes
 */
public class Exercise30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float a, b, c;

        System.out.println("Enter the size of the first line segment: ");
        a = reader.nextFloat();
        System.out.println("Enter the size of the second line segment: ");
        b = reader.nextFloat();
        System.out.println("Enter the size of the third line segment: ");
        c = reader.nextFloat();

        if(a < (b + c) && b < (c + a) && c < (b + a)){
            // System.out.println("Could be a triangle!");
            if(a == b && c == b)
                System.out.println("Equilateral triangle");
            else if(a == b || b == c || c == a)
                System.out.println("Isosceles triangle");
            else if(a != b && b != c && c != a)
                System.out.println("Scalene triangle");
        } else
            System.out.println("It can't be a triangle");

        reader.close();
    }
}
