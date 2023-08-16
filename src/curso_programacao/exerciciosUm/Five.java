package curso_programacao.exerciciosUm;

import java.util.Locale;
import java.util.Scanner;

public class Five {
	
	/*Fazer um programa para ler o código de uma peça 1,
	o número de peças 1, o valor unitário de cada peça 1, 
	o código de uma peça 2, o número de peças 2 e o valor
	unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();
		double valorUni = scanner.nextDouble();
		
		double resultado = quantidade * valorUni;
		scanner.nextLine();
		int codigoDois = scanner.nextInt();
		int quantidadeDois = scanner.nextInt();
		double valorUniDois = scanner.nextDouble();
		
		double resultadoDois = quantidadeDois * valorUniDois;
		
		double soma = resultado + resultadoDois;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f" , soma);
		
		scanner.close();
		
		
		
	}

}
