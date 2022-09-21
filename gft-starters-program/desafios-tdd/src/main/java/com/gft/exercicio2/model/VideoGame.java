package com.gft.exercicio2.model;

import com.gft.exercicio2.interfaces.Imposto;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {
	}
	
	public VideoGame(double preco, int qtd) {
		this.setPreco(preco);
		this.setQtd(qtd);
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
	public double calculaImposto() {
		double imposto;
		if (this.getPreco() == 0d) {
			throw new ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException();
		} else {
			if (this.isUsado()) {
				imposto = this.getPreco() * 0.25d;
			} else {
				imposto = this.getPreco() * 0.45d;
			}
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return "Video-game: " + this.getModelo() + ", preço: " + this.getPreco() + ", quantidade: " + this.getQtd()
				+ " em estoque.";
	}

}
