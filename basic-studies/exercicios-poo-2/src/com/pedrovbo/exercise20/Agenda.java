package com.pedrovbo.exercise20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(String nome, String telefone) {
        this.contatos.add(new Contato(nome, telefone));
    }

    public void buscaContato(String nome) {
        nome = nome.toUpperCase();
        boolean encontrado = false;
        for (Contato i : this.contatos
        ) {
            if (i.getNome().toUpperCase().contentEquals(nome)) {
                System.out.println("Contato encontrado: \n" +
                        "Nome: " + i.getNome() +
                        "\t" +
                        "Telefone: " + i.getTelefone());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public void totalContatos() {
        int total = 0;
        for (Contato i : this.contatos
        ) {
            total++;
        }

        System.out.println("Total de contatos: " + total);


    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contato=" + contatos +
                '}';
    }
}
