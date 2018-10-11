package s03.a49.util;

// Exercício de Fixação

/*
 * CurrencyConverter
 * ---------------------
 * - iof: static double
 * ---------------------
 * + totalReais(dollarPrice: double, quantityToBuy: double): double
 */

public class CurrencyConverter {
	
	static double iof = 0.06;
	
	public static double totalReais(double dollarPrice, double quantityToBuy) {
		return (1+iof)*dollarPrice*quantityToBuy;
	}

}
