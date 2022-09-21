package br.com.gft.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {

	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String toString() {
		return "Video-game: " + this.getModelo() + ", preço: " + this.getPreco() + ", quantidade: " + this.getQtd()
				+ " em estoque.";
	}

	@Override
	public double calculaImposto() {
		DecimalFormat df = new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));
		df.setMinimumFractionDigits(1);
		double imposto = 0d;
		if (this.isUsado()) {
			imposto = this.getPreco() * 0.25d;
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " usado, R$ " + imposto + ".");

			return this.getPreco() * 0.25d;
		} else {
			imposto = this.getPreco() * 0.45d;
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " R$ " + imposto + ".");
			return this.getPreco() * 0.45d;
		}
	}

}
