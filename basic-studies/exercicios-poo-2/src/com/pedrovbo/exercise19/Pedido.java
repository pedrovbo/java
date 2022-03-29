package com.pedrovbo.exercise19;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Supermercado supermercado;
    private List<Produto> produto;
    private String formaPagamento;

    public Pedido(Cliente cliente, Supermercado supermercado, List<Produto> produto) {
        this.cliente = cliente;
        this.supermercado = supermercado;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", supermercado=" + supermercado +
                ", produto=" + produto +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
