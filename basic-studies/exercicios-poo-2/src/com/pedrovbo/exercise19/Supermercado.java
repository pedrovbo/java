package com.pedrovbo.exercise19;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    private boolean pago;

    public Supermercado(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(String nomeProduto, float preco, int quantidade){
        produtos.add(new Produto(nomeProduto, preco, quantidade));
    }

    public void receberPedido(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
