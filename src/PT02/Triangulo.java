package PT02;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String [ ] args) {
		
		System.out.printf("- Triângulo válido: %s%n", ehTrianguloValido() ? "Sim" : "Não");
	}

	public static boolean ehTrianguloValido() {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		
		System.out.println("== Triângulo ==");
		System.out.print("- Insira o comprimento do lado 1: ");
		double lado1 = sc.nextDouble();
		System.out.print("- Insira o comprimento do lado 2: ");
		double lado2 = sc.nextDouble();
		System.out.print("- Insira o comprimento do lado 3: ");
		double lado3 = sc.nextDouble();
		
		if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2 ) {
			valido = true;
		}
		
		return valido;
	}
}
