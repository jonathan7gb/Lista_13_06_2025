package PT02;

import java.util.Scanner;

public class ConversorTemperatura {
	
	public static void main(String [ ] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- Qual a temperatura em °C: ");
		double celsius = sc.nextDouble();
		
		System.out.println("- Temperatura Convertida: " + celsiusParaFahrenheit(celsius) + "F" );
	}

	public static double celsiusParaFahrenheit(double celsius) {
		System.out.println("== Conversor de Temperatura ==");
		
		double conta = (celsius * 9/5) + 32;
		
		return conta;
	}
}
