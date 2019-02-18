package application;

public class DadosDisciplinas {
	
	private String nomes;
	private int qtdAcertos;
	private int qtdQuestoes;
	
	
	public DadosDisciplinas() {
	}
	
	public DadosDisciplinas(String nomes, int qtdAcertos, int qtdQuestoes) {
		this.nomes = nomes;
		this.qtdAcertos = qtdAcertos;
		this.qtdQuestoes = qtdQuestoes;
	}

	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public int getQtdAcertos() {
		return qtdAcertos;
	}
	public void setQtdAcertos(int qtdAcertos) {
		this.qtdAcertos = qtdAcertos;
	}
	public int getQtdQuestoes() {
		return qtdQuestoes;
	}
	public void setQtdQuestoes(int qtdQuestoes) {
		this.qtdQuestoes = qtdQuestoes;
	}
}
