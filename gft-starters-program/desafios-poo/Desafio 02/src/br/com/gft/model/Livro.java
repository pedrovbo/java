package br.com.gft.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qtdPag;

	public Livro() {

	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
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

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public String toString() {
		return "Titulo: " + getNome() + ", preço: " + getPreco() + ", quantidade: " + getQtd() + " em estoque.";
	}

	@Override
	public double calculaImposto() {

		DecimalFormat df = new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));
		df.setMinimumFractionDigits(1);
		double imposto = this.getPreco() * 0.10d;
		if (this.getTema().contentEquals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + this.getNome() + ".");
			return 0;
		} else {
			System.out.println("R$ " + df.format(imposto) + " de impostos sobre o livro " + this.getNome() + ".");
			return imposto;
		}

	}

}
