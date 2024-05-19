package br.com.dominio;

public class Principal {

	public static void main(String[] args) {
		
		GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);

	}
}
