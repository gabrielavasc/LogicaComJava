package exerciciosJava;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite um n�mero de 1 a 7:");
		int numeroReferenteaoDiaDaSemana = scanner.nextInt();

		String diaDaSemana = null;

		switch (numeroReferenteaoDiaDaSemana) {

		case 1:
			diaDaSemana = "O dia da semana � domingo";
			break;
		case 2:
			diaDaSemana = "O dia da semana � segunda-feira";
			break;
		case 3:
			diaDaSemana = "O dia da semana � ter�a-feira";
			break;
		case 4:
			diaDaSemana = "O dia da semana � quarta-feira";
			break;
		case 5:
			diaDaSemana = "O dia da semana � quinta-feira";
			break;
		case 6:
			diaDaSemana = "O dia da semana � sexta-feira";
			break;
		case 7:
			diaDaSemana = "O dia da semana � s�bado";
			break;
		default:
			System.err.println("Digite um n�mero v�lido!");
			System.exit(1);

		}

		scanner.close();

		System.out.println(diaDaSemana);

	}

}
