package com.pedrovbo.exercise19;

public class Cliente {
    private String nome;

    public float fazerPedido(Supermercado supermercado, String produto, int quantidade) {
        Pedido pedido = new Pedido(this, supermercado, supermercado.getProdutos());
        float valorTotal = 0f;
        for (Produto i : supermercado.getProdutos()
        ) {
            if (produto.contentEquals(i.getNome()) && i.getQuantidade() >= quantidade) {
                i.setQuantidade(i.getQuantidade() - quantidade);
                valorTotal = i.getPreco() * quantidade;
                System.out.println("Produto adicionado ao pedido!");
            } else if (i.getQuantidade() < quantidade)
                System.out.println("Sem estoque para esta quantidade!");
        }

        return valorTotal;

    }

    public void pagarPedido() {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
