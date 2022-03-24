package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
 * para
 * carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
 * que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
 * quantos Km foram percorridos. No final mostre o preço a ser pago de acordo
 * com a
 * tabela a seguir:
 * 
 * - Carros populares (aluguel de R$90 por dia)
 * - Até 100Km percorridos: R$0,20 por Km
 * - Acima de 100Km percorridos: R$0,10 por Km
 * - Carros de luxo (aluguel de R$150 por dia)
 * - Até 200Km percorridos: R$0,30 por Km
 * - Acima de 200Km percorridos: R$0,25 por Km
 */
public class Exercise35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tipoCarro = "";
        int diasAluguel, KmPercorridos;
        float preco = 0f;

        System.out.println("Qual tipo de carro: luxo/popular");
        tipoCarro = in.next();
        System.out.println("Quantos dias de aluguel? ");
        diasAluguel = in.nextInt();
        System.out.println("Quantos Km foram percorridos? ");
        KmPercorridos = in.nextInt();

        if(tipoCarro.toLowerCase().contentEquals("popular")){
            // $90 por dia
            preco += (90*diasAluguel);
            if(KmPercorridos <= 100){
                // $0,20 por Km
                preco += (KmPercorridos * 0.20f);
            } else if(KmPercorridos > 100){
                // $0.10 por Km
                preco += (KmPercorridos * 0.10f);
            }
        } else if (tipoCarro.toLowerCase().contentEquals("luxo")){
            // $150 por dia
            preco += (150*diasAluguel);
            if(KmPercorridos <= 200){
                // $0,30 por Km
                preco += (KmPercorridos * 0.30f);
            } else if(KmPercorridos > 200){
                // $0,25 por Km
                preco += (KmPercorridos * 0.25f);
            }
        }

        System.out.printf("O preco a ser pago R$%.2f %n", preco);


        in.close();
    }
}
