package br.com.dominio.service;

import java.math.BigDecimal;
import br.com.dominio.model.Produto;

/**
 * DECORATOR (estrutura)
 * 
 * 
 * Objetivo: adicionar novas funcionalidades a um objeto existente, sem mexer na sua estrutura.
 */

public class CalculoPrecoComFrete implements CalculoPreco {

	private CalculoPreco calculo;
	
	public CalculoPrecoComFrete(CalculoPreco calculo) {
		
		this.calculo = calculo;
		
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		
		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		BigDecimal frete;
		
		if (produto.getQuantidade() > 3) {
			
			frete = new BigDecimal("11.00");
			valorFinal = valorFinal.add(frete);
			
			return valorFinal;
			
		} else {
			
			frete = new BigDecimal("17.00");
			valorFinal = valorFinal.add(frete);
			
			return valorFinal;
		}
		

	}

	
	
}
