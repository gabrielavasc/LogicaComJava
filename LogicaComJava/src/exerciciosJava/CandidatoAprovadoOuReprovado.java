package exerciciosJava;

import java.util.Scanner;

public class CandidatoAprovadoOuReprovado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite a nota da prova de Português:");
		double notaPortugues = scanner.nextDouble();

		System.out.println("Favor  digite a nota da prova de Matemática:");
		double notaMatematica = scanner.nextDouble();

		double soma = notaPortugues + notaMatematica;

		if (notaPortugues < 6 || notaMatematica < 6) {

			System.out.println("Candidato reprovado!");

		} else if (soma >= 15) {

			System.out.println("Candidato aprovado!");

		} else if (soma < 15) {

			System.out.println("Candidato reprovado!");

		}
		scanner.close();

	}

}
