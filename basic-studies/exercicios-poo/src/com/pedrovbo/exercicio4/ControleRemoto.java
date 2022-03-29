package com.pedrovbo.exercicio4;

public class ControleRemoto {
    private final Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void ligar(){
        if(!this.tv.isLigada()){
            this.tv.setLigada(true);
        } else {
            System.out.println("Tv já está ligada!");
        }
    }

    public void desligar(){
        if(!this.tv.isLigada()){
            System.out.println("Tv já está desligada!");
        } else{
            this.tv.setLigada(false);
        }
    }
    public void aumentarVolume() {
        if(this.tv.isLigada())
            this.tv.setVolume(this.tv.getVolume() + 5);
        else
            System.out.println("Tv desligada!");
    }

    public void diminuirVolume() {
        if(this.tv.isLigada())
            this.tv.setVolume(this.tv.getVolume() - 5);
        else
            System.out.println("Tv desligada!");
    }

    public void trocarCanal(int canal) {
        if(this.tv.isLigada()){
            if (canal == this.tv.getCanal())
                System.out.println("Você já está nesse canal");
            else
                this.tv.setCanal(canal);
        }
        else{
            System.out.println("Tv desligada!");
        }

    }

    public void status() {
        if(this.tv.isLigada()){
            System.out.println(
                    "Volume: " + this.tv.getVolume() +
                            " Canal: " + this.tv.getCanal()
            );
        } else{
            System.out.println("Tv desligada!");
        }

    }
}
