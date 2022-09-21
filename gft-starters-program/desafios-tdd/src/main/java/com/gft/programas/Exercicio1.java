package com.gft.programas;

import com.gft.exericio1.model.Veiculo;
import com.gft.exericio1.service.AcimaDoLimiteDoTanqueDeCombustivelException;
import com.gft.exericio1.service.VeiculoNaoPodeAcelerarDesligadoException;

public interface Exercicio1 {

	public static void start() {

		inicioPrograma();
		// Criando com construtor vazio
		Veiculo carroUm = new Veiculo();
		carroUm.setCor("Branco");
		carroUm.setKm(0f);
		carroUm.setLitrosCombustivel(0);
		carroUm.setMarca("Volkswagen");
		carroUm.setModelo("Gol");
		carroUm.setPlaca("PLC0011");
		carroUm.setPreco(38000d);
		carroUm.setVelocidade(0);

		try {
			System.out.println("\nTeste de aceleração:");
			statusVeiculo(carroUm);
			System.out.println("Carro antes de acelerar: " + carroUm.getVelocidade());
			carroUm.acelerar();
			System.out.println("Carro depois de acelerar: " + carroUm.getVelocidade() + "\n\n");
		} catch (VeiculoNaoPodeAcelerarDesligadoException e) {
			imprimirExcecaoParaUsuario(e);
		}

		try {

			carroUm.ligar();
			statusVeiculo(carroUm);
			System.out.println("\nTeste de aceleração:");
			System.out.println("Carro antes de acelerar: " + carroUm.getVelocidade());
			carroUm.acelerar();
			System.out.println("Carro depois de acelerar: " + carroUm.getVelocidade() + "\n\n");
		} catch (VeiculoNaoPodeAcelerarDesligadoException e) {
			imprimirExcecaoParaUsuario(e);
		}

		System.out.println("Teste de abastecimento:");
		System.out.println("Carro antes de abastecer: " + carroUm.getLitrosCombustivel());
		carroUm.abastecer(30);
		System.out.println("Carro depois de abastecer: " + carroUm.getLitrosCombustivel() + "\n\n");

		try {
			System.out.println("Teste da validação do limite do tanque de combustível:");
			carroUm.abastecer(30);
			carroUm.abastecer(40);
		} catch (AcimaDoLimiteDoTanqueDeCombustivelException e) {
			imprimirExcecaoParaUsuario(e);
		}

		try {
			System.out.println("\n\nTeste de freios:");
			carroUm.acelerar();
			System.out.println("Carro antes de acionar freios: " + carroUm.getVelocidade());
			carroUm.frear();
			System.out.println("Carro após de acionar freios a primeira vez: " + carroUm.getVelocidade());
			carroUm.frear();
			System.out.println("Carro após de acionar freios a segunda vez: " + carroUm.getVelocidade());
			carroUm.frear();
		} catch (Exception e) {
			imprimirExcecaoParaUsuario(e);
		}

		System.out.println("\nTeste pintura:");
		System.out.println("Carro antes da pintura: " + carroUm.getCor());
		carroUm.pintar("Vermelho");
		System.out.println("Carro após a pintura: " + carroUm.getCor());

		try {
			System.out.println("\n\nTestar ligar:");
			System.out.println("Carro está ligado? " + carroUm.isLigado());
			carroUm.ligar();
			System.out.println("Carro está ligado? " + carroUm.isLigado());
			carroUm.ligar();
		} catch (Exception e) {
			imprimirExcecaoParaUsuario(e);
		}

		try {
			System.out.println("\n\nTestar desligar:");
			System.out.println("Carro está ligado? " + carroUm.isLigado());
			carroUm.desligar();
			System.out.println("Carro está ligado? " + carroUm.isLigado());
			carroUm.desligar();
		} catch (Exception e) {
			imprimirExcecaoParaUsuario(e);
		}

		fimPrograma();

	}

	public static void statusVeiculo(Veiculo carroUm) {
		System.out.println(carroUm.statusVeiculo());
	}

	public static void imprimirExcecaoParaUsuario(Exception e) {
		divisorConsole();
		System.out.println(e.getMessage());
		divisorConsole();
	}

	private static void divisorConsole() {
		System.out.println("###################################");
	}

	private static void inicioPrograma() {
		System.out.println("###### INICIO DO EXERCÍCIO 1 #######");
		System.out.println("####################################");
		System.out.println();
	}

	private static void fimPrograma() {
		System.out.println("####### FIM DO EXERCÍCIO 1 ########");
		System.out.println("###################################");
		System.out.println();
	}

}
