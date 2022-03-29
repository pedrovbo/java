package com.pedrovbo.exercise21;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private int totalPaginas;
    private String status;
    private String autor;
    private String genero;

    public Livro(String titulo, int anoPublicacao, int totalPaginas, String genero, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.totalPaginas = totalPaginas;
        this.genero = genero;
        this.autor = autor;
        this.status = "Disponível";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", totalPaginas=" + totalPaginas +
                ", status='" + status + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
