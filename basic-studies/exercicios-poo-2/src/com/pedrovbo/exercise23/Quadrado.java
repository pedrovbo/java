package com.pedrovbo.exercise23;

public class Quadrado extends FiguraGeometrica{
    private double tamanhoLados;

    public Quadrado(double tamanhoLados) {
        this.setTipo("Quadrado");
        this.tamanhoLados = tamanhoLados;
    }

    @Override
    public void imprimirForma() {
        System.out.println();
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println();
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do quadrado é: " + (Math.pow(this.getTamanhoLados(), 2)));
    }

    public double getTamanhoLados() {
        return tamanhoLados;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "tipo='" + tipo + '\'' +
                ", tamanhoLados=" + tamanhoLados +
                '}';
    }
}
