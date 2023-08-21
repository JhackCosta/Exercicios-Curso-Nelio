package exerciciosDois;

import java.util.Locale;
import java.util.Scanner;

public class Eight {
	/*Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
	de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de 
	Imposto de Renda, segundo a tabela.
	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
	salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
	de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
	duas casas decimais.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		
		double resposta = 0;
		double primeiraTaxa = 0;
		double segundaTaxa = 0;
		double terceiraTaxa = 0;
	
		double oito = 0.08;
		double dezoito = 0.18;
		double vinteOito = 0.28;
		
		if(n > 2000.00){
			primeiraTaxa = n - 2000.00;
			if(primeiraTaxa > 1000.00) {
				segundaTaxa = primeiraTaxa - 1000;
				if(segundaTaxa > 0 && segundaTaxa < 1500.00) {
					primeiraTaxa = 1000;
					resposta = (primeiraTaxa * oito) + (segundaTaxa * dezoito);
				}else{
					primeiraTaxa = 1000;
					terceiraTaxa = segundaTaxa - 1500;
					segundaTaxa = 1500;
					resposta = (primeiraTaxa * oito) + (segundaTaxa * dezoito) + (terceiraTaxa * vinteOito);
				}
			}else {
				resposta = primeiraTaxa * oito;
			}
		}
		if(n <= 2000.00) {
			System.out.println("Isento");	
		}else {
			System.out.printf("R$ %.2f", resposta);
		}
		scanner.close();
	}

}
