package com.pedrovbo.exercicio1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    public Pessoa() {

    }

    public Pessoa(String nome, String dataNascimento, float altura) throws ParseException {
        this.nome = nome;
        this.setDataNascimento(dataNascimento);
        this.altura = altura;
    }

    public Pessoa(String nome, int dataNascimento, float altura) throws ParseException {
        this.nome = nome;
        this.setDataNascimento(dataNascimento);
        this.altura = altura;
    }

    public String calculaIdade() {

        LocalDate hoje = LocalDate.now();
        return "Idade: " + (hoje.getYear() - this.dataNascimento.getYear());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataNascimento.format(formatter);
    }

    public void setDataNascimento(String dataNasc) throws ParseException {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNasc, format);
    }

    public void setDataNascimento(int idade) throws ParseException {
        LocalDate data = LocalDate.now();
        int anoNascimento = data.getYear() - idade;
        //TODO: Melhorar esse algoritmo truncado!
        String anoNasc = "01/01/"+ anoNascimento;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(anoNasc, format);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome: '" + this.getNome() + '\'' +
                ", Data de Nascimento; " + this.getDataNascimento() +
                ", Altura: " + this.getAltura() + ", " + this.calculaIdade() +
                '}';
    }
}
