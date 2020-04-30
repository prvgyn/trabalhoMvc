package br.com.trabalhoMvc.domain;

public class Pagamento {
	private int id;
	private boolean aprovacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAprovacao() {
		return aprovacao;
	}
	public void setAprovacao(boolean aprovacao) {
		this.aprovacao = aprovacao;
	}
	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", aprovacao=" + aprovacao + "]";
	}
	
	
}
