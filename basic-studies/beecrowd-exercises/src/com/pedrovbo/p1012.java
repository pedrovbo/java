package com.pedrovbo;

import java.util.Scanner;

public class p1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        System.out.printf("TRIANGULO: %.3f%n", ((a*c)/2));
        System.out.printf("CIRCULO: %.3f%n", ((3.14159)*Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", (((a+b)*c)/2));
        System.out.printf("QUADRADO: %.3f%n", (Math.pow(b,2)));
        System.out.printf("RETANGULO: %.3f%n", (a*b));

        in.close();
    }
}