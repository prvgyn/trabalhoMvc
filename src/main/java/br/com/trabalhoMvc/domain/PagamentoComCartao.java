package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class PagamentoComCartao extends Pagamento{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numeroDeParcelas;
	private boolean afirmacao;
	
		public PagamentoComCartao() {
			// TODO Auto-generated constructor stub
		}
	
	public PagamentoComCartao(int id, int numeroDeParcelas, boolean afirmacao) {
		super();
		this.id = id;
		this.numeroDeParcelas = numeroDeParcelas;
		this.afirmacao = afirmacao;
	}



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
	
	
	
	
	
}	
