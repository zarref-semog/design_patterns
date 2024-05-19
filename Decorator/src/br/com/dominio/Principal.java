package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.model.Produto;
import br.com.dominio.service.CalculoPreco;
import br.com.dominio.service.CalculoPrecoComBrinde;
import br.com.dominio.service.CalculoPrecoComFrete;
import br.com.dominio.service.CalculoPrecoComum;

public class Principal {

	public static void main(String[] args) {
		
		Produto  produto = new Produto();
		
		produto.setNome("Cd Legi�o Urbana");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal("40.00"));
		
		CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComFrete(new CalculoPrecoComum()));
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("R$ " + preco.doubleValue());

	}

}
