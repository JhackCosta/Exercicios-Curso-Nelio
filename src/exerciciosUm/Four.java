package exerciciosUm;

import java.util.Locale;
import java.util.Scanner;

public class Four {

	/*Fazer um programa que leia o número de um funcionário,
	seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário
	do funcionário, com duas casas decimais.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		int horasTrabalhadas = scanner.nextInt();
		
		double valorHora = scanner.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
	
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", numero, salario);
		
		scanner.close();
	}

}
