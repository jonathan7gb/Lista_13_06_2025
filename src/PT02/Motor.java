package PT02;

import java.util.Scanner;

public class Motor {
	
	public static void main(String [ ] args) {
		
		
		System.out.printf("- Potência do motor: %dW", getPotencia());
	}

	public static int getPotencia() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== Get Potência ==");
		System.out.print("- Digite a potência do motor em W: ");
		int potencia = sc.nextInt();
		
		return potencia;
	}
}
