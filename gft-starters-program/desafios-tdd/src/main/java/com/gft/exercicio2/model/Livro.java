package com.gft.exercicio2.model;

import com.gft.exercicio2.interfaces.Imposto;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int quantidadePaga;

	public Livro() {
		this.tema = "";
	}
	
	public Livro(double preco, int qtd) {
		this.setPreco(preco);
		this.setQtd(qtd);
	}



	public Livro(String nome, double preco, int qtd, String autor, String tema, int quantidadePaga) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.quantidadePaga = quantidadePaga;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantidadePaga() {
		return quantidadePaga;
	}

	public void setQuantidadePaga(int quantidadePaga) {
		this.quantidadePaga = quantidadePaga;
	}

	@Override
	public double calculaImposto() {
		double imposto;
		if (this.getTema().contentEquals("educativo")) {
			return 0d;
		} else {
			if (this.getPreco() == 0d) {
				throw new ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException();
			} else {
				imposto = this.getPreco() * 0.1d;
			}
		}

		return imposto;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + getNome() + ", preço: " + getPreco() + ", quantidade: " + getQtd() + " em estoque.";
	}

}
