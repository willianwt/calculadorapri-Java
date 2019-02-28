package application;

public class Totais extends DadosDisciplinas{
	private int totalQuestoes;
	private int totalAcertos;
	private double notaGlobal;
	


	public Totais() {
		
	}

	public int getTotalQuestoes() {
		return totalQuestoes;
	}

	public void setTotalQuestoes(int totalQuestoes) {
		this.totalQuestoes += totalQuestoes;
	}

	public int getTotalAcertos() {
		return totalAcertos;
	}

	public void setTotalAcertos(int totalAcertos) {
		this.totalAcertos += totalAcertos;
	}
	
	public double notaMateria(double qtdQuestoes, double qtdAcertos) {
		return ((3 / qtdQuestoes) * qtdAcertos);
	}

	public double notaGlobal(double totalQuestoes, double totalAcertos) {
		return (2 / totalQuestoes) * totalAcertos;
	}
	public double getNotaGlobal() {
		return notaGlobal;
	}

	public void setNotaGlobal(double notaGlobal) {
		this.notaGlobal = notaGlobal;
	}
}
