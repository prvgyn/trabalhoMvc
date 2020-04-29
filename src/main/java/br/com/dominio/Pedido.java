package br.com.dominio;

import java.sql.Date;

public class Pedido {
	private int id;
	private Date instante;
	
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
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", instante=" + instante + "]";
	} 
	
	
	
	
}
