package exerciciosJava;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite um número de 1 a 7:");
		int numeroReferenteaoDiaDaSemana = scanner.nextInt();

		String diaDaSemana = null;

		switch (numeroReferenteaoDiaDaSemana) {

		case 1:
			diaDaSemana = "O dia da semana é domingo";
			break;
		case 2:
			diaDaSemana = "O dia da semana é segunda-feira";
			break;
		case 3:
			diaDaSemana = "O dia da semana é terça-feira";
			break;
		case 4:
			diaDaSemana = "O dia da semana é quarta-feira";
			break;
		case 5:
			diaDaSemana = "O dia da semana é quinta-feira";
			break;
		case 6:
			diaDaSemana = "O dia da semana é sexta-feira";
			break;
		case 7:
			diaDaSemana = "O dia da semana é sábado";
			break;
		default:
			System.err.println("Digite um número válido!");
			System.exit(1);

		}

		scanner.close();

		System.out.println(diaDaSemana);

	}

}
