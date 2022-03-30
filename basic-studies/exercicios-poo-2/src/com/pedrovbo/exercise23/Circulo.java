package com.pedrovbo.exercise23;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.setTipo("Círculo");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void imprimirForma() {
        System.out.println();
        System.out.println(" ****");
        System.out.println("*******");
        System.out.println(" ****");
        System.out.println();
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do círculo é: " + (Math.PI *(Math.pow(this.getRaio(), 2))));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
