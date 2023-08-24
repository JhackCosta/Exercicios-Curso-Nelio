package estruturaFor;

import java.util.Scanner;

public class One {

	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		for (int i = 0; i <= valor; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
