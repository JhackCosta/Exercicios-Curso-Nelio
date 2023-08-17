package exerciciosUm;

import java.util.Locale;
import java.util.Scanner;

public class Two {
	
	/*Faça um programa para ler o valor do raio de um círculo,
	  	e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double p =  3.14159;
		double raio = scanner.nextDouble();
		double resultado = p*Math.pow(raio, 2);

		System.out.printf("A = %.4f",resultado);
		
		scanner.close();
	}

}
