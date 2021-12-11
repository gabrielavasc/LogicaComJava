package exerciciosJava;

import java.util.Scanner;

public class TarefasDoDia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tarefasDoDia = new String[5];

		System.out.println("Digite as suas 5 tarefas do dia mais importantes:");

		for (int i = 0; i < tarefasDoDia.length; i++) {
			tarefasDoDia[i] = scanner.next();
		}

		for (int i = 0; i < tarefasDoDia.length; i++) {
			System.out.println("Tarefa:" + tarefasDoDia[i]);
		}

		scanner.close();
	}
}
