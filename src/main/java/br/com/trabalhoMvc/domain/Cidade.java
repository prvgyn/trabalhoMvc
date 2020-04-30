package br.com.trabalhoMvc.domain;

import java.io.Serializable;


import javax.persistence.*;

@Entity
public class Cidade implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="estadoCidade")
	private Estado estadoCidade;
	
	public Cidade() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Cidade(int id, String nome, Estado estadoCidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.estadoCidade = estadoCidade;
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
	
	
	public Estado getEstadoCidade() {
		return estadoCidade;
	}


	public void setEstadoCidade(Estado estadoCidade) {
		this.estadoCidade = estadoCidade;
	}


		
}
