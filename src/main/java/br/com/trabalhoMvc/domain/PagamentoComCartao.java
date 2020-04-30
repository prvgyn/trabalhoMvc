package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PagamentoComCartao implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
	
	
	
	
	
}	
