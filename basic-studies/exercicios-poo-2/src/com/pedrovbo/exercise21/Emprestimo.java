package com.pedrovbo.exercise21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int duracao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Pessoa usuario;
    private List<Livro> acervoLivros;

    public Emprestimo() {
        this.acervoLivros = new ArrayList<Livro>();
    }

    public Emprestimo(
            int duracao,
            LocalDate dataInicio,
            LocalDate dataFim,
            Pessoa usuario
    ) {
        this.duracao = duracao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
        this.acervoLivros = new ArrayList<Livro>();
    }

    public void emprestar(Livro l, String titulo) {

    }

    public boolean buscarLivro(String titulo) {
        titulo = titulo.toUpperCase();
        boolean encontrado = false;
        for (Livro i : acervoLivros
        ) {
            if(i.getTitulo().toUpperCase().contentEquals(titulo)){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void adicionarLivroAcervo(Livro l) {
        this.acervoLivros.add(l);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public List<Livro> getAcervoLivros() {
        return acervoLivros;
    }

    public void setAcervoLivros(List<Livro> acervoLivros) {
        this.acervoLivros = acervoLivros;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "duracao=" + duracao +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", usuario=" + usuario +
                ", livrosEmprestados=" + acervoLivros +
                '}';
    }
}
