package exerciciosDois;

import java.util.Scanner;
	/*Leia a hora inicial e a hora final de um jogo.
	  A seguir calcule a duração do jogo, sabendo que o mesmo pode
	  começar em um dia e terminar em outro, tendo uma duração mínima
	  de 1 hora e máxima de 24 horas.*/
public class Four {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int h = 0;

		if(B > A) {
			h = B-A;
		}else {
			h = (24 - A) + B;
		}
		System.out.println("O JOGO DUROU " + h + " HORA(S)");
		
		scanner.close();
	}
}
