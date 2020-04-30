package br.com.trabalhoMvc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	
	
	@OneToMany(mappedBy="clienteEndereco")
	private List<Endereco> enderecoCliente;
	
	
	@OneToMany(mappedBy ="clienteTelefone")
	private List<Telefone> telefonesCliente;
	
	@OneToMany(mappedBy ="clientePedido")
	private List<Pedido> pedidosCliente;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cliente(int id, String nome, String email, String cpfOuCnpj, boolean tipoCliente, List<Endereco> enderecoCliente,
			ArrayList<Telefone> telefoneCliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipoCliente = tipoCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefonesCliente = telefoneCliente;
	}

	


	public List<Telefone> getTelefonesCliente() {
		return telefonesCliente;
	}



	public void setTelefonesCliente(List<Telefone> telefonesCliente) {
		this.telefonesCliente = telefonesCliente;
	}



	public List<Pedido> getPedidosCliente() {
		return pedidosCliente;
	}



	public void setPedidosCliente(List<Pedido> pedidosCliente) {
		this.pedidosCliente = pedidosCliente;
	}



	public List<Endereco> getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(List<Endereco> enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public List<Telefone> getTelefoneCliente() {
		return telefonesCliente;
	}
	public void setTelefoneCliente(ArrayList<Telefone> telefoneCliente) {
		this.telefonesCliente = telefoneCliente;
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
