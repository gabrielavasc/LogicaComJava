package exerciciosJava;

import java.util.Scanner;

public class CalculoDeIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite o seu peso em Kg:");
		Double peso = scanner.nextDouble();

		System.out.println("Favor digite a sua altura em metros:");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);

		System.out.println("O IMC  é de: " + imc);

		scanner.close();

	}

}
