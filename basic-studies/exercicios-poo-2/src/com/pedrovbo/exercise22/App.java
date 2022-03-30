package com.pedrovbo.exercise22;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro", 33);
        Pessoa p1 = new Pessoa("Eduardo", 59);
        Pessoa p2 = new Pessoa("Ana", 59);

        p.setAscendencia(p1, p2);
        p.getAscendencia();
        System.out.println(p);


    }
}
