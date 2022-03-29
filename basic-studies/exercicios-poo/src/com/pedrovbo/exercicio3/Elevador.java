package com.pedrovbo.exercicio3;

public class Elevador {
    private int andarAtual; //  térreo = 0
    private int totalAndares; //  desconsiderando o térreo
    private int capacidade;
    private int pessoasPresentes;

    public Elevador() {
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void Inicializa(int capacidade, int totalAndares){
        this.setCapacidade(capacidade);
        this.setTotalAndares(totalAndares);
    }

    public void Entra(){
        if(this.getPessoasPresentes()+1 <= this.getCapacidade()){
            this.setPessoasPresentes(this.getPessoasPresentes()+1);
        } else
            System.out.println("Elevador lotado!");
    }

    public void Sai(){
        if(this.getPessoasPresentes() > 0)
            this.setPessoasPresentes(this.getPessoasPresentes()-1);
        else
            System.out.println("Elevador vazio!");
    }

    public void Sobe(){
        if(this.getAndarAtual() == this.getTotalAndares())
            System.out.println("Último andar, impossível subir!");
        else
            this.setAndarAtual(this.getAndarAtual()+1);
    }

    public void Desce(){
        if(this.getAndarAtual() == 0)
            System.out.println("Você está no térreo, impossível descer!");
        else
            this.setAndarAtual(this.getAndarAtual()-1);
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    @Override
    public String toString() {
        return "Elevador:\n" +
                "Andar atual:" + andarAtual +
                "\nTotal andares:" + totalAndares +
                "\nCapacidade=" + capacidade +
                "\nPessoas presentes=" + pessoasPresentes;
    }
}
