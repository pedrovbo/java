package com.pedrovbo.exercicio4;

public class Televisao {
    private int volume;
    private boolean ligada;
    private int canal;

    public Televisao() {
        this.volume = 30;
        this.ligada = false;
    }

    protected int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected boolean isLigada() {
        return ligada;
    }

    protected void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    protected int getCanal() {
        return canal;
    }

    protected void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", ligada=" + ligada +
                ", canal=" + canal +
                '}';
    }
}
