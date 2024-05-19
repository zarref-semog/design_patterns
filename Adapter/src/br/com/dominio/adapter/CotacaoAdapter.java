package br.com.dominio.adapter;

public class CotacaoAdapter extends Cotacao {
	
	@Override
	public void setValor(double valor) {
		super.setValor(valor / 5.00);
	}
	
	@Override
	public double getValor() {
		return (super.getValor() * 5.00);
	}
	
	public double getValorDolar() {
		return super.getValor();
	}
	
}
