package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Categoria  implements Serializable{
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
