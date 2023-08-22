package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Seven {
	/*Leia 2 valores com uma casa decimal (x e y), que devem representar as 
	coordenadas de um ponto em um plano. A seguir, determine qual o 
	quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
	cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem,
	escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
	“Eixo X” ou “Eixo Y”*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		scanner.close();
	}

}
