package exerciciosJava;

import java.util.Scanner;

public class ImprimeNomeESobrenome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite seu primeiro nome:");
		String nome = scanner.next();
		System.out.println("Favor digite seu sobrenome:");
		String sobrenome = scanner.next();
		System.out.println("O nome completo é: " + nome + " " + sobrenome);

		scanner.close();
	}

}
