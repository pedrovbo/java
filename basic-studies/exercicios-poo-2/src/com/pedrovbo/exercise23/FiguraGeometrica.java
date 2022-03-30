package com.pedrovbo.exercise23;

public abstract class FiguraGeometrica {
    public String tipo;

    public abstract void imprimirForma();

    public abstract void calcularArea();


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
