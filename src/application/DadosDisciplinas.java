package application;

public class DadosDisciplinas {
	
	private String nomes;
	private int qtdAcertos;
	private int qtdQuestoes;
	private double notaMateria;

	

	public DadosDisciplinas() {
	}
	
	
	public double getNotaMateria() {
		return notaMateria;
	}

	public void setNotaMateria(double notaMateria) {
		this.notaMateria = notaMateria;
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
