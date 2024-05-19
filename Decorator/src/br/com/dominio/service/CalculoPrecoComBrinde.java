package br.com.dominio.service;

import java.math.BigDecimal;
import br.com.dominio.model.Produto;

/**
 * DECORATOR (estrutura)
 * 
 * Objetivo: adicionar novas funcionalidades a um objeto existente, sem mexer na sua estrutura.
 */

public class CalculoPrecoComBrinde implements CalculoPreco {

	private CalculoPreco calculo;
	
	public CalculoPrecoComBrinde(CalculoPreco calculo) {
		
		this.calculo = calculo;
		
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		
		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		BigDecimal brinde = new BigDecimal("100.00");
		
		valorFinal = valorFinal.add(brinde);
		
		return valorFinal;
	}

}
