package estruturaFor;

import java.util.Scanner;

public class Four {
	/*
	 * Fazer um programa para ler um número N. Depois leia N pares de números e
	 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
	 * mostrar a mensagem "divisao impossivel".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double divisor = sc.nextDouble();
			double denominador = sc.nextDouble();

			if (denominador == 0) {
				System.out.println("divisao impossivel");
			} else {
				double dividendo = divisor / denominador;
				System.out.printf("%.1f\n", dividendo);
			}

		}

		sc.close();

	}

}
