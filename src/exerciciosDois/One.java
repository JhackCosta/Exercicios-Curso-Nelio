package exerciciosDois;

import java.util.Scanner;

public class One {
	/*Fazer um programa para ler um número inteiro,
	  e depois dizer se este número é negativo ou não.
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		if(n < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		scanner.close();
	}
}
