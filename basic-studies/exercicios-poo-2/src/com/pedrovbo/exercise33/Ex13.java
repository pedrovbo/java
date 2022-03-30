package com.pedrovbo.exercise33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Ordene um vetor de 100 números inteiros gerados aleatoriamente.
public class Ex13 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(100));
        }

        numeros.forEach(i -> System.out.print(i + " "));

        Collections.sort(numeros);
        System.out.println();
        System.out.println();

        numeros.forEach(i -> System.out.print(i + " "));

    }
}
