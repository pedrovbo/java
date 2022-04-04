package com.pedrovbo;

import java.util.Scanner;

public class p1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double distancia, combustivel;

        distancia = in.nextDouble();
        combustivel = in.nextDouble();

        System.out.printf("%.3f km/l%n", (distancia / combustivel));

        in.close();
    }
}