package br.com.dominio;

import java.io.Serializable;

import javax.persistence.*;

public class Cliente implements Serializable{
	private static final long serialversionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private boolean tipoCliente;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	public boolean isTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(boolean tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", cpfOuCnpj=" + cpfOuCnpj
				+ ", tipoCliente=" + tipoCliente + "]";
	}
	
	
	
	
}
