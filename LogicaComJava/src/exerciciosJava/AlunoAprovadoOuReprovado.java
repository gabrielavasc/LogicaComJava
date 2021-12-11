package exerciciosJava;

import java.util.Scanner;

public class AlunoAprovadoOuReprovado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite a nota do aluno: ");
		int nota = scanner.nextInt();
		int notaMinima = 7;
		Boolean aprovado = nota >= notaMinima;

		scanner.close();

		if (aprovado) {
			System.out.println("Aluno aprovado!");

		} else {
			System.out.println("Aluno reprovado!");
		}

	}

}
