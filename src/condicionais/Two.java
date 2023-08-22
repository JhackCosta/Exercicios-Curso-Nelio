package condicionais;

import java.util.Scanner;

public class Two {
	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		scanner.close();

	}

}
