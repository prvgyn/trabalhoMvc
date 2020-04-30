package br.com.trabalhoMvc.domain;

import br.com.trabalhoMvc.domain.Categoria;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Produto  implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private String nome;
	private double preco;
	
  
	private ArrayList<ItemPedido> produtoItem = new ArrayList<ItemPedido>();
	
	public ArrayList<ItemPedido> getprodutoItem() {
		return produtoItem;
	}



	public void setProdutoItem(ArrayList<ItemPedido> produtoItem) {
		this.produtoItem = produtoItem;
	}



	@ManyToOne
	@JoinColumn(name="categoriaProduto")	
	private Categoria categoriaProduto;
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Produto(int id, String nome, double preco, Categoria categoriaProduto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoriaProduto = categoriaProduto;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public Categoria getCategoriaProduto() {
		return categoriaProduto;
	}



	public void setCategoriaProduto(Categoria categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	
}
