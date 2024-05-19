package br.com.dominio.mensagem;

/**
 * FACTORY METHOD (criacao)
 * 
 * Objetivo: Criar objetos sem especificar qual classe sera utilizada.
 *
 */

public class MensagemFactory {
	public static Mensagem getMensagem(int i) {
		if (i == 1) {
			return new MensagemEmail();
		} else {
			return new MensagemSMS();
		}
	}
}
