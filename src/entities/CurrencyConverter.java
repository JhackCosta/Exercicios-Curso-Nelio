package entities;

public class CurrencyConverter {
	
	private static double juros = 0.06;

	public static double totalDolar(double valor, double quantidade) {
		
		double total = (valor * quantidade);
		
		total += (total * juros);
		return total;
	}
}
