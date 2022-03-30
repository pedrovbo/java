package com.pedrovbo.exercise33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Crie  duas  List  de  50  posições  com  valores  inteiros  aleatórios,  ordene
 * cada  List individualmente, e combine as duas List gerando uma nova List de
 * 100 posições, de forma que essa nova List já seja criada ordenada.
 */
public class Ex14 {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>();
        List<Integer> ordenados;
        List<Integer> maiorDez = null;

        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            numeros1.add(rand.nextInt(50));
            numeros2.add(rand.nextInt(50));
        }

        System.out.println("Lista 1: ");

        numeros1.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("Lista 2: ");

        numeros2.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Collections.sort(numeros1);
        Collections.sort(numeros2);

        ordenados = Stream.concat(numeros1.stream(), numeros2.stream()).sorted().collect(Collectors.toList());

        System.out.println("Lista una ordenada: ");

        ordenados.forEach(i -> System.out.print(i + " "));


    }
}
