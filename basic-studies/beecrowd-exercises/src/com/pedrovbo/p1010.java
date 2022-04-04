package com.pedrovbo;

import java.util.Scanner;

public class p1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] productCode = new int[2], amount = new int[2];
        float[] price = new float[2];
        float total = 0f;

        productCode[0] = in.nextInt();
        amount[0] = in.nextInt();
        price[0] = in.nextFloat();
        productCode[1] = in.nextInt();
        amount[1] = in.nextInt();
        price[1] = in.nextFloat();

        total = amount[0] * price[0];
        total += amount[1] * price[1];

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        in.close();
    }
}