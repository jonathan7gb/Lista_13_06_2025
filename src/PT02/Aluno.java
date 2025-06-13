package PT02;

import java.util.Scanner;

public class Aluno {
	
	public static void main(String [ ] args) {
		
		System.out.println("- Média: " + media());
	}
	
	public static float media() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calcular Média ==");
		System.out.print("- Digite a 1º Nota: ");
		float n1 = sc.nextFloat();
		System.out.print("- Digite a 2º Nota: ");
		float n2 = sc.nextFloat();
		
		float conta = (n1 + n2) / 2;
		
		return conta;
	}
}
