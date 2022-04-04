package com.pedrovbo;

import java.util.Scanner;

public class p1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, volume = 0.0;

        radius = in.nextDouble();
        volume = ((4.0/3)*3.14159)*Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
        in.close();

    }
}