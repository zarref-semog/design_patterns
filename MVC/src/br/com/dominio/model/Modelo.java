package br.com.dominio.model;


/**
 * MVC (estrutura)
 * 
 * Model - JavaBeans (Objetos de Negocio).
 * 
 * Objetivo: contem os atributos e metodos do objeto de negocio.
 */
public class Modelo {
	
	private int valor;
	
	public void somaNumeros(int numero1, int numero2) {
		
		this.valor = numero1 + numero2;
		
	}
	
	public int getValor() {
		
		return valor;
		
	}
	
}
