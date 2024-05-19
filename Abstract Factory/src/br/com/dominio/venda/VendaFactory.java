package br.com.dominio.venda;

import br.com.dominio.boleto.Boleto;
import br.com.dominio.nfe.NFE;

/**
 * ABSTRACT FACTORY (estrutura)
 * 
 * Objetivo: Fornece uma interface para criacao de familias de objetos
 * independentes, sem especificar suas classes concretas.
 *
 */

public interface VendaFactory {

		public NFE criarNFE();
		
		public Boleto criarBoleto();
}
