package br.com.trabalhoMvc.domain;

import java.io.Serializable;


import javax.persistence.*;
@Entity
public class Estado  implements Serializable {
	
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Estado(int id, String nome) {
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
		return "Estado [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
