package br.com.dominio;

/**
 * SINGLETON (criacao)
 * 
 * Objetivo: Impedir que haja mais de uma instancia para uma determinada classe.
 * 
 */

public class GerenciadorImpressao {
	
	private static GerenciadorImpressao gerenciadorImpressao;
	
	private GerenciadorImpressao() {};
	
	public static GerenciadorImpressao getInstance() {
		if (gerenciadorImpressao == null) {
			gerenciadorImpressao = new GerenciadorImpressao();
		}
		return gerenciadorImpressao;
	}

}
