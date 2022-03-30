package com.pedrovbo.exercise23;

public class App {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(4);
        Retangulo r = new Retangulo(4, 2);
        Triangulo t  = new Triangulo(2, 6);
        Circulo c = new Circulo(8);

        q.imprimirForma();
        CalculaArea(q);
        System.out.println(q);
        System.out.println("\n\n");

        r.imprimirForma();
        CalculaArea(r);
        System.out.println(r);
        System.out.println("\n\n");

        t.imprimirForma();
        CalculaArea(t);
        System.out.println(t);
        System.out.println("\n\n");

        c.imprimirForma();
        CalculaArea(c);
        System.out.println(c);
        System.out.println("\n\n");



    }

    public static void CalculaArea(FiguraGeometrica figura){
        figura.calcularArea();
    }

}
