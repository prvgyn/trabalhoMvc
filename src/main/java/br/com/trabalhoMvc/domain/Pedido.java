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
