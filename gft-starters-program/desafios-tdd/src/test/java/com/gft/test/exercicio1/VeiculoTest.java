package com.gft.test.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.gft.exericio1.model.Veiculo;
import com.gft.exericio1.service.AcimaDoLimiteDoTanqueDeCombustivelException;
import com.gft.exericio1.service.VeiculoJaEstaDesligadoException;
import com.gft.exericio1.service.VeiculoJaEstaLigadoException;
import com.gft.exericio1.service.VeiculoJaEstaParadoException;
import com.gft.exericio1.service.VeiculoNaoPodeAcelerarDesligadoException;
import com.gft.exericio1.service.VeiculoNaoPodeSerDesligadoEmMovimentoException;

public class VeiculoTest {

	private Veiculo veiculoDesligado;
	private Veiculo veiculoLigado;
	
	@Mock Veiculo veiculoMockado = new Veiculo();

	@BeforeEach
	void setup() {
		veiculoDesligado = new Veiculo("Prata", false, 0);
		veiculoLigado = new Veiculo("Prata", true, 0);
	}

	private void assertAcelerar(int velocidadeEsperada, Veiculo veiculo) {
		assertEquals(velocidadeEsperada, veiculo.getVelocidade());
	}

	private void assertAbastecer(int quantidadeCombustivelEsperada, Veiculo veiculo) {
		assertEquals(quantidadeCombustivelEsperada, veiculo.getLitrosCombustivel());
	}

	private void assertFrear(int velocidadeEsperada, Veiculo veiculo) {
		assertEquals(velocidadeEsperada, veiculo.getVelocidade());
	}

	private void assertPintar(String corEsperada, Veiculo veiculo) {
		assertEquals(corEsperada, veiculo.getCor());
	}

	private void assertLigarVeiculo(boolean estadoEsperado, Veiculo veiculo) {
		assertEquals(true, veiculo.isLigado());
	}

	private void assertDesligar(boolean estadoEsperado, Veiculo veiculo) {
		assertEquals(false, veiculo.isLigado());
	}

	@Test
	void deveAcelerarAcrescentandoMaisVinteAVelocidadeAtual() throws Exception {
		veiculoLigado.acelerar();
		assertAcelerar(20, veiculoLigado);
	}

	@Test
	void naoDeveAcelerarVeiculoDesligado() throws Exception {
		assertThrows(VeiculoNaoPodeAcelerarDesligadoException.class, () -> veiculoDesligado.acelerar());
	}

	@Test
	void deveAbastecerUmaQuantidadeDeCombustivel() throws Exception {
		veiculoDesligado.abastecer(10);
		assertAbastecer(10, veiculoDesligado);
	}

	@Test
	void deveLimitarQuantidadeDeAbastecimentoASessentaLitros() throws Exception {
		assertThrows(AcimaDoLimiteDoTanqueDeCombustivelException.class, () -> veiculoDesligado.abastecer(70));
	}

	@Test
	void deveFrearOVeiculoDiminuindoAVelocidadeAtualEmVinte() throws Exception {
		veiculoLigado.acelerar();
		veiculoLigado.frear();
		assertFrear(0, veiculoLigado);
	}

	@Test
	void naoDeveFrearComOVeiculoParado() throws Exception {
		assertThrows(VeiculoJaEstaParadoException.class, () -> veiculoDesligado.frear());
	}
	
	@Test
	void deveRetornarVelocidadeZeroSeFreioResultarEmVelocidadeNegativa() throws Exception {
		veiculoLigado.setVelocidade(15);
		veiculoLigado.frear();		
		assertEquals(0, veiculoLigado.getVelocidade());
	}

	@Test
	void devePintarOVeiculo() throws Exception {
		veiculoDesligado.pintar("Vermelho");
		assertPintar("Vermelho", veiculoDesligado);
	}

	@Test
	void deveLigarOVeiculo() throws Exception {
		veiculoDesligado.ligar();
		assertLigarVeiculo(true, veiculoDesligado);
	}

	@Test
	void naoDeveLigarOVeiculoJaLigado() throws Exception {
		assertThrows(VeiculoJaEstaLigadoException.class, () -> veiculoLigado.ligar());
	}

	@Test
	void deveDesligarOVeiculo() throws Exception {
		veiculoLigado.desligar();
		assertDesligar(false, veiculoDesligado);
	}

	@Test
	void naoDeveDesligarVeiculoJaDesligado() throws Exception {
		assertThrows(VeiculoJaEstaDesligadoException.class, () -> veiculoDesligado.desligar());
	}

	@Test
	void naoDevePermitirDesligarOVeiculoEmMovimento() throws Exception {
		veiculoLigado.acelerar();
		assertThrows(VeiculoNaoPodeSerDesligadoEmMovimentoException.class, () -> veiculoLigado.desligar());
	}
	
	@Test
	void deveRetornarStatusVeiculo() throws Exception {
		String testeStatusVeiculo = "Carro ligado: true com 0 de combustível, numa velocidade de 0km/h.";
		assertEquals(testeStatusVeiculo, veiculoLigado.statusVeiculo());
	}
	
}
