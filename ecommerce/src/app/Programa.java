package app;


import entities.CarrinhoDeCompras;
import entities.Loja;

import java.util.Scanner;

import static entities.Produtos.*;
import static entities.Produtos.estoqueProduto;

public class Programa {

	public static void main(String[] args) {

		char resposta;
		String codigoProduto = "";
		Scanner lerInt = new Scanner(System.in);
		Scanner lerStr = new Scanner(System.in);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Loja loja = new Loja();



		// TELA 1
		loja.getNome();
		loja.getSlogan();

		System.out.println("RELATÓRIO DE PRODUTOS");
		System.out.println("");
		// DESEJA FAZER COMPRAS?
		System.out.println("DESEJA FAZER COMPRAS S/N: ");
		resposta = lerStr.next().toUpperCase().charAt(0);
		// MÉTODO PARA PROSSEGUIR PROGRAMA

		while (resposta == 'S'){
			//MOSTRA RELATÓRIO DE PRODUTOS
			for (int i = 0; i < 10; i++) {
				System.out.println(
						codigos.get(i) + "\t\t" +
								produtos.get(i) + "\t\t" +
								valorProduto.get(i) + "\t\t" +
								estoqueProduto.get(i) + "\t\t"
				);

			}
			// ESCOLHA DO PRODUTO PELO CODIGO
			System.out.println();
			System.out.println("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
			codigoProduto = "";
			codigoProduto = lerStr.next().toUpperCase();
			// TODO implementar a seleção do produto e retorno no carrinho
			//VERIFICA SE O CODIGO DIGITADO É VÁLIDO
			//TODO implementar validação do código
			//MOSTRA CARRINHO DE COMPRAS
			carrinho.getCarrinho(codigoProduto);
			// VERIFICA SE DESEJA CONTINUAR A COMPRA
			System.out.println("\n\nDESEJA CONTINUAR COMPRANDO? S/N: ");
			resposta = 0;
			resposta = lerStr.next().toUpperCase().charAt(0);

		}




		System.out.println("OBRIGADO, VOLTE SEMPRE!");
	}


}
