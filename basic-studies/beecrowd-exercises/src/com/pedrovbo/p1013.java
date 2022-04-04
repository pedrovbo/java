package com.pedrovbo;

import java.util.Scanner;

public class p1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[3];
        int maior = 0;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            if(maior < a[i]){
                maior = a[i];
            }
        }

        System.out.println(maior + " eh o maior");

        in.close();
    }
}
