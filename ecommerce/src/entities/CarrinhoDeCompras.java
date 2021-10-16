package entities;

public class CarrinhoDeCompras extends Produtos {

	private boolean produtoNoCarrinho;
	private boolean continuaCompra;

 	// TODO uma forma de alocar os produtos escolhidos nos programa

	// TODO método de validação para itens no carrinho
	// não pode haver a inserção mais de uma vez do mesmo produto

	public void validacaoCarrinho() {
		// TODO o método não deve permitir a a inserção do mesmo produto

	}

	public void compra() {

	}

	public void getCarrinho(String codigoProduto) {
		// String saida = "";
		// int index = 0;
		String controle = "";
		System.out.println("_____________________________________________");
		System.out.println("\n\nCARRINHO DE COMPRAS\n");
		System.out.println("COD\t  PRODUTO\t   ESTOQUE\tVALOR");
		// TODO implementar a saída para o carrinho dos itens selecionados para compra
		for(int i = 0; i < 10; i++) {
			controle = codigos.get(i);
			if(codigoProduto.contentEquals(controle)){
				System.out.println(
						codigos.get(i) + "\t\t" +
								produtos.get(i) + "\t\t" +
								valorProduto.get(i) + "\t\t" +
								estoqueProduto.get(i) + "\t\t"
				);
			}
		}
		//return saida;
		
		
		
		
	}

	public boolean isContinuaCompra(char resposta) {

		if (resposta == 'S') {
			this.continuaCompra = true;

		} else if (resposta == 'N') {
			this.continuaCompra = false;

		}
		return this.continuaCompra;
	}
	// TODO metodo pra verificar se já existe produto no carrinho
	// TODO implementar todos os métodos de validação

	public void validaProdutoEscolhido() {

	}

}
