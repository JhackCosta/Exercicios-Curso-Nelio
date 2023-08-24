package estruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Three {

	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
	 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
	 * o terceiro valor tem peso 5.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pUm = 2;
		int pDois = 3;
		int PTres = 5;

		double nota = 0;
		double soma = 0;

		for (int z = 0; z < n; z++) {
			for (int i = 0; i < 3; i++) {
				nota = sc.nextDouble();

				if (i == 0) {
					soma = pUm * nota;
				} else if (i == 1) {
					soma = soma + (pDois * nota);
				} else {
					soma = soma + (PTres * nota);
				}

			}
			soma = soma / 10;
			System.out.printf("%.1f \n", soma);
		}

		sc.close();
	}
}
