package com.pedrovbo;

import java.util.Scanner;

public class p1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempo, velocidade;
        double litros=0d;

        tempo = in.nextInt();
        velocidade = in.nextInt();

        litros = tempo * velocidade;

        System.out.printf("%.3f%n", (litros/12));

        in.close();
    }
}