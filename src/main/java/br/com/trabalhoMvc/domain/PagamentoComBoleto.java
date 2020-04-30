package br.com.trabalhoMvc.domain;

import java.sql.Date;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PagamentoComBoleto(int id, Date dataVencimento, Date dataPagamento) {
		super();
		this.id = id;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}	
