package com.pedrovbo.exercise23;

public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.setTipo("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void imprimirForma() {
        System.out.println();
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println();
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retângulo é: " + (this.getBase() * this.getAltura()));
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "tipo='" + tipo + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
