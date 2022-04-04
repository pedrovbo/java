package com.pedrovbo;

import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        valor = in.nextInt();

        System.out.println(valor);

        System.out.printf("%d nota(s) de R$ 100,00%n", (valor / 100));
        if (valor >= 100)
            valor %= 100;
        System.out.printf("%d nota(s) de R$ 50,00%n", (valor / 50));
        if (valor >= 50)
            valor %= 50;
        System.out.printf("%d nota(s) de R$ 20,00%n", (valor / 20));
        if (valor >= 20)
            valor %= 20;
        System.out.printf("%d nota(s) de R$ 10,00%n", (valor / 10));
        if (valor >= 10)
            valor %= 10;
        System.out.printf("%d nota(s) de R$ 5,00%n", (valor / 5));
        if (valor >= 5)
            valor %= 5;
        System.out.printf("%d nota(s) de R$ 2,00%n", (valor / 2));
        if (valor >= 2)
            valor %= 2;
        System.out.printf("%d nota(s) de R$ 1,00%n", valor);

        in.close();
    }
}