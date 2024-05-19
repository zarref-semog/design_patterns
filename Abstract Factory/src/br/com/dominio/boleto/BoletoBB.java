package br.com.dominio.boleto;

import br.com.dominio.modelo.Produto;

public class BoletoBB implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		
		System.out.println("BANCO DO BRASIL");
		System.out.println("=================================================");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getNome());
		System.out.println("Valor: " + produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor total: " + produto.getValorTotal(imposto));
	}

}
