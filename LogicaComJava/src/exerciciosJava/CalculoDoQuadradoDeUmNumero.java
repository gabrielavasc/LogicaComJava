package exerciciosJava;

import java.util.Scanner;

public class CalculoDoQuadradoDeUmNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite um n�mero inteiro:");
		int numero = scanner.nextInt();
		int quadrado = numero * numero;
		System.out.println("O quadrado do n�mero digitado �: " + quadrado);

		scanner.close();

	}

}
