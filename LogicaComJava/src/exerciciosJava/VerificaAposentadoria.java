package exerciciosJava;

import java.util.Scanner;

public class VerificaAposentadoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite a sua idade:");
		int idade = scanner.nextInt();

		System.out.println("Favor  digite o tempo que voc� contribuiu para a previd�ncia:");
		int tempoDeContribuicao = scanner.nextInt();

		if ((idade >= 55) && (tempoDeContribuicao >= 25)) {

			System.out.println("Voc� pode se aposentar!");

		} else {
			System.out.println("Voc� n�o pode se aposentar!");
		}

		scanner.close();
	}

}
