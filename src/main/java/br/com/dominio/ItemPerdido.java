package br.com.dominio;

public class ItemPerdido {
	private double desconto;
	private double preco;
	private int quantidade;
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "ItemPerdido [desconto=" + desconto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}
