package br.com.dominio;

public class PagamentoComCartao {
	private int numeroDeParcelas;
	private boolean afirmacao;
	
	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	public boolean isAfirmacao() {
		return afirmacao;
	}
	public void setAfirmacao(boolean afirmacao) {
		this.afirmacao = afirmacao;
	}
	@Override
	public String toString() {
		return "PagamentoComCartao [numeroDeParcelas=" + numeroDeParcelas + ", afirmacao=" + afirmacao + "]";
	}
	
	
	
	
}	
