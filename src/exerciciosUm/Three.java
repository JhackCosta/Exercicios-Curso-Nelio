package exerciciosUm;

import java.util.Scanner;

public class Three {

		/*Fazer um programa para ler quatro valores inteiros
	  	A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		int resultado = ((A*B)- (C*D));
		
		System.out.println("DIFERENCA = " + resultado);
		
		scanner.close();
	}

}
