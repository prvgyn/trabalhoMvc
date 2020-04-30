package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Cliente implements Serializable{
	private static final long serialversionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private boolean tipoCliente;//PJ / PF?
	
	@ManyToOne
	@JoinColumn(name="enderecoCliente")
	private Endereco enderecoCliente;
	@ManyToOne
	@JoinColumn(name="telefoneCliente")
	private Telefone telefoneCliente;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cliente(int id, String nome, String email, String cpfOuCnpj, boolean tipoCliente, Endereco enderecoCliente,
			Telefone telefoneCliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipoCliente = tipoCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
	}



	public Endereco getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(Endereco enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public Telefone getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(Telefone telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
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
		
	
}
