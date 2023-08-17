package exerciciosDois;

import java.util.Locale;
import java.util.Scanner;

public class Five {

	/*Com base na tabela abaixo, escreva um programa que leia o
	 código de um item e a quantidade deste item. A
	 seguir, calcule e mostre o valor da conta a pagar.
	 Codigo-------------Espeficacao -------------preco R$
	 1-------------------Cachorro quente --------4.00
	 2-------------------X-Salada----------------4.50
	 3-------------------X-Bacon-----------------5.00
	 4-------------------Torrada simples---------2.00
	 5-------------------Refrigerante------------1.50
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		double total = 0;
		
		if(A == 1) {
			total = (B * 4.00);
		}else if(A == 2) {
			total = (B * 4.50);
		}
		else if(A == 3) {
			total = (B * 5.00);
		}
		else if(A == 4) {
			total = (B * 2.00);
		}
		else if(A == 5) {
			total = (B * 1.50);
		}
		System.out.printf("Total: R$ %.2f", total);
		scanner.close();
	}

}
