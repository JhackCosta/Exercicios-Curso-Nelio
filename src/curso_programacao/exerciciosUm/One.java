package curso_programacao.exerciciosUm;

import java.util.Scanner;

public class One {

	/*Faça um programa para ler dois valores inteiros,
	 e depois mostrar na tela a soma desses números com uma
	mensagem explicativa.*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		scanner.close();
	}

}
