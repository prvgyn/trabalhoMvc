package br.com.trabalhoMvc.domain;

import java.io.Serializable;


import javax.persistence.*;
@Entity
public class Endereco implements Serializable {
	
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private int cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	
	@OneToOne
	@JoinColumn(name="cidadeEndereco")
	private Cidade cidadeEndereco;
	
	@ManyToOne
	private Cliente clienteEndereco;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Endereco(int id, int numero, int cep, String logradouro, String complemento, String bairro,
			Cidade cidadeEndereco) {
		super();
		this.id = id;
		this.numero = numero;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidadeEndereco = cidadeEndereco;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public Cidade getCidadeEndereco() {
		return cidadeEndereco;
	}


	public void setCidadeEndereco(Cidade cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}


		
	
}
