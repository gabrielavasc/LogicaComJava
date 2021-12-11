package exerciciosJava;

import java.util.Scanner;

public class VerificaAposentadoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite a sua idade:");
		int idade = scanner.nextInt();

		System.out.println("Favor  digite o tempo que você contribuiu para a previdência:");
		int tempoDeContribuicao = scanner.nextInt();

		if ((idade >= 55) && (tempoDeContribuicao >= 25)) {

			System.out.println("Você pode se aposentar!");

		} else {
			System.out.println("Você não pode se aposentar!");
		}

		scanner.close();
	}

}
