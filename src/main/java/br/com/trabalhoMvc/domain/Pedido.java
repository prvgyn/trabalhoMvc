package br.com.trabalhoMvc.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Pedido implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private Date instante;
	

	private ArrayList<ItemPedido> produtoItem = new ArrayList<ItemPedido>();
	
	@OneToOne
	@JoinColumn(name="pagamento")
	private Pagamento pagamento;
	
	
	@ManyToOne
	private Cliente clientePedido;
	
	public ArrayList<ItemPedido> getProdutoItem() {
		return produtoItem;
	}



	public void setProdutoItem(ArrayList<ItemPedido> produtoItem) {
		this.produtoItem = produtoItem;
	}



	public Pagamento getPagamento() {
		return pagamento;
	}



	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}



	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pedido(int id, Date instante, ArrayList<ItemPedido> produtoItem) {
		super();
		this.id = id;
		this.instante = instante;
		this.produtoItem = produtoItem;
	}



	public ArrayList<ItemPedido> getItens() {
		return produtoItem;
	}
	public void setItens(ArrayList<ItemPedido> produtoItem) {
		this.produtoItem = produtoItem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getInstante() {
		return instante;
	}
	public void setInstante(Date instante) {
		this.instante = instante;
	}

	
	
}
