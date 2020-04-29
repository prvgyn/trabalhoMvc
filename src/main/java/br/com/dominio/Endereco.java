package br.com.dominio;

public class Endereco {
	private int id;
	private int numero;
	private int cep;
	private String logradouro;
	private String complemento;
	private String bairro;
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
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", numero=" + numero + ", cep=" + cep + ", logradouro=" + logradouro
				+ ", complemento=" + complemento + ", bairro=" + bairro + "]";
	}
	
	
}
