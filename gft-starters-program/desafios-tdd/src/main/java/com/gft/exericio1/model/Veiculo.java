package com.gft.exericio1.model;

import com.gft.exericio1.service.AcimaDoLimiteDoTanqueDeCombustivelException;
import com.gft.exericio1.service.VeiculoJaEstaDesligadoException;
import com.gft.exericio1.service.VeiculoJaEstaLigadoException;
import com.gft.exericio1.service.VeiculoJaEstaParadoException;
import com.gft.exericio1.service.VeiculoNaoPodeAcelerarDesligadoException;
import com.gft.exericio1.service.VeiculoNaoPodeSerDesligadoEmMovimentoException;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public Veiculo() {
		this.velocidade = 0;
		this.isLigado = false;
	}

	public Veiculo(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.isLigado = false;
		this.velocidade = 0;
	}

	public Veiculo(String cor, boolean carroLigado, int litrosCombustivel) {
		this.cor = cor;
		this.isLigado = carroLigado;
		this.litrosCombustivel = litrosCombustivel;
	}

	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, int litrosCombustivel, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.litrosCombustivel = litrosCombustivel;
		this.preco = preco;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public void acelerar() {
		if (!this.isLigado) {
			throw new VeiculoNaoPodeAcelerarDesligadoException();
		} else {
			this.setVelocidade(this.getVelocidade() + 20);
		}

	}

	public void abastecer(int combustivel) {
		if (this.getLitrosCombustivel() + combustivel > 60) {
			throw new AcimaDoLimiteDoTanqueDeCombustivelException();
		} else {
			this.setLitrosCombustivel(this.getLitrosCombustivel() + combustivel);
		}

	}

	public void frear() {
		// TODO chain of responsability?
		if (this.getVelocidade() == 0) {
			throw new VeiculoJaEstaParadoException();
		} else {
			if (this.getVelocidade() - 20 < 0) {
				this.setVelocidade(0);
			} else {
				this.setVelocidade(this.getVelocidade() - 20);
			}
		}
	}

	public void pintar(String cor) {
		this.setCor(cor);
	}

	public void ligar() {
		if (this.isLigado) {
			throw new VeiculoJaEstaLigadoException();
		} else {
			this.setLigado(true);
		}
	}

	public void desligar() {
		if (!this.isLigado) {
			throw new VeiculoJaEstaDesligadoException();
		} else if (this.getVelocidade() > 0) {
			throw new VeiculoNaoPodeSerDesligadoEmMovimentoException();
		} else {
			this.setLigado(false);
		}
	}

	public String statusVeiculo() {
		return "Carro ligado: " + this.isLigado() 
		+ " com " + this.getLitrosCombustivel() + " de combustível, numa velocidade de " + this.getVelocidade() + "km/h.";
	}
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", km=" + km
				+ ", isLigado=" + isLigado + ", litrosCombustivel=" + litrosCombustivel + ", velocidade=" + velocidade
				+ ", preco=" + preco + "]";
	}

}
