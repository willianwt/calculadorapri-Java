package application;

import java.util.Scanner;
import application.Totais;
import application.DadosDisciplinas;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Disciplinas disc = new Disciplinas();
		
		System.out.println("Calculadora de Notas - PRI");
		System.out.println("Informe a quantidade de DISCIPLINAS da PRI: ");
		disc.setDisciplinas(sc.nextInt());
		
		DadosDisciplinas[] dados = new DadosDisciplinas[disc.getDisciplinas()];
		Totais totalQuestoes = new Totais();
		
		for (int i = 0; i < disc.getDisciplinas(); i++) {
			sc.nextLine();
			dados[i] = new DadosDisciplinas();
			
			System.out.println("Informe o nomde da " + (i+1) + "� disciplina: ");
			dados[i].setNomes(sc.nextLine());
			System.out.println("Informe o n�mero de quest�es da " + (i+1) + "� Disciplina:");
			dados[i].setQtdQuestoes(sc.nextInt());
			System.out.println("Informe o n�mero de acertos da " + (i+1) + "� Disciplina:");
			dados[i].setQtdAcertos(sc.nextInt());			
			
			totalQuestoes.setTotalAcertos(dados[i].getQtdAcertos());
			totalQuestoes.setTotalQuestoes(dados[i].getQtdQuestoes());
			dados[i].setNotaMateria(totalQuestoes.notaMateria(dados[i].getQtdQuestoes(), dados[i].getQtdAcertos()));
			

		}
		totalQuestoes.setNotaGlobal(totalQuestoes.notaGlobal(totalQuestoes.getTotalQuestoes(), totalQuestoes.getTotalAcertos()));

		
		// Resultados
		
		System.out.println("Resultado:");
		System.out.println("Sua prova continha " + totalQuestoes.getTotalQuestoes() + " quest�es.");
		System.out.println("Voc� acertou no total " + totalQuestoes.getTotalAcertos() + " quest�es.");
		System.out.printf("Sua nota Global � %.2f \n", totalQuestoes.getNotaGlobal());
		
		for (int i = 0; i < dados.length; i++) {
			System.out.println("<<<<<<<<< " + dados[i].getNomes() + " >>>>>>>>>>>");
			System.out.println("Voce acertou " + dados[i].getQtdAcertos() + " de " + dados[i].getQtdQuestoes() + ".");
			System.out.printf("Sua nota espec�fica nesta disciplina � %.2f %n", dados[i].getNotaMateria());
			System.out.printf("A nota total em " + dados[i].getNomes() + " � %.2f. %n", (totalQuestoes.getNotaGlobal() + dados[i].getNotaMateria()));
			System.out.println(" -----------------------------------------------------------------------");
		}
		sc.close();
	}

}

