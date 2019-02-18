package application;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Disciplinas disc = new Disciplinas();
		
		System.out.println("Calculadora de Notas - PRI");
		System.out.println("Informe a quantidade de DISCIPLINAS da PRI: ");
		disc.setDisciplinas(sc.nextInt());
		
		DadosDisciplinas[] dados = new DadosDisciplinas[disc.getDisciplinas()];
		
		for (int i = 0; i < disc.getDisciplinas(); i++) {
			sc.nextLine();

			System.out.println("Informe o nomde da " + (i+1) + "� disciplina: ");
			String nomes = sc.nextLine();
			System.out.println("Informe o n�mero de quest�es da " + (i+1) + "� Disciplina:");
			int qtdQuestoes = sc.nextInt();
			System.out.println("Informe o n�mero de acertos da " + (i+1) + "� Disciplina:");
			int qtdAcertos = sc.nextInt();
			
			dados[i] = new DadosDisciplinas(nomes, qtdAcertos, qtdQuestoes);

		}
		sc.close();
	}

}
