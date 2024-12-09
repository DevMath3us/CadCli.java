package br.com.cadastro;

public class ChecklistItem {
	private String descricao;
	private boolean concluido;
	private String categoria;
	
	public ChecklistItem(String descricao, String categoria) {
		this.descricao = descricao;
		this.concluido = false;
		this.categoria = categoria;
	}
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public boolean isConcluido() { return concluido; }
	public void setConcluido(boolean concluido) { this.concluido = concluido;}
	
	public String getVeiculo() { return categoria; }
	public void setCategoria(String categoria) { this.categoria = categoria; }

	@Override
	public String toString() {
		return "ChecklistItem[descricao=" + descricao + ", concluido=" + concluido + ", categoria=" + categoria + "]";
	}

}
