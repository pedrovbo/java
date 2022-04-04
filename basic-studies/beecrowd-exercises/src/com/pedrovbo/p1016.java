package com.pedrovbo;

import java.util.Scanner;

public class p1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int distancia;

        distancia = in.nextInt();

        System.out.printf("%d minutos%n", (distancia*2));

        in.close();
    }
}