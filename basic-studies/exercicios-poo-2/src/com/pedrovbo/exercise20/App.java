package com.pedrovbo.exercise20;

public class App {
    public static void main(String[] args) {

        Agenda a = new Agenda();

        a.adicionarContato("Pedro", "999988822");
        a.adicionarContato("Gessica", "3271637126");
        a.adicionarContato("Katarine", "2178639127");
        a.adicionarContato("Robson", "3271631312");
        a.adicionarContato("André", "273612683");

        a.buscaContato("Robson");

        System.out.println(a);

        a.totalContatos();
    }
}
