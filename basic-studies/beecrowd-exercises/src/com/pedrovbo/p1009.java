package com.pedrovbo;

import java.io.IOException;
import java.util.Scanner;

public class p1009 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String employeeName;
        double salary, sales, total;
        employeeName = in.next();
        salary = in.nextDouble();
        sales = in.nextDouble();
        sales *= Double.valueOf(0.15);
        total = salary + sales;
        System.out.printf("TOTAL = R$ %.2f%n", total);

        in.close();

    }

}
