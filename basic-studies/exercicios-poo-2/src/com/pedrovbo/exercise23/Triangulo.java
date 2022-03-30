package com.pedrovbo.exercise23;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.setTipo("Triângulo");
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
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" ******");
        System.out.println("********");
        System.out.println();

    }

    @Override
    public void calcularArea() {
        System.out.println("A área do triângulo é: " + ((this.getBase()*this.getAltura())/2));
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "tipo='" + tipo + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
