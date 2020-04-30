package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public abstract class Pagamento  implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean estadoPagamento;
	
	private PagamentoComBoleto pagtoBoleto;
	
	private PagamentoComCartao pagtoCartao;
	
	public Pagamento() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pagamento(int id, boolean estadoPagamento, PagamentoComBoleto pagtoBoleto, PagamentoComCartao pagtoCartao) {
		super();
		this.id = id;
		this.estadoPagamento = estadoPagamento;
		this.pagtoBoleto = pagtoBoleto;
		this.pagtoCartao = pagtoCartao;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEstadoPagamento() {
		return estadoPagamento;
	}
	public void setEstadoPagamento(boolean estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}
	
	
}
