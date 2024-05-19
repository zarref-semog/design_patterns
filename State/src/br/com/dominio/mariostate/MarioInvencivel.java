package br.com.dominio.mariostate;

import br.com.dominio.state.State;

public class MarioInvencivel implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Mais 1000 pontos!");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma estrela: Mais 1000 pontos!");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Mais 1000 pontos!");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com um inimigo: O inimigo morreu!");
		return this;
	}

	@Override
	public String retornarTipo() {
		return "Mario Invencível";
	}

}
