package com.pedrovbo.exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;


    public String calculaIdade() {
        //TODO: implementar
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
