package PT02;

import java.util.Scanner;

public class Funcionario {
	
	public static void main(String [ ] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- Digite o bônus do salário: ");
		double bonus = sc.nextDouble();
		
		System.out.println("- Salário com Bônus: R$" + calcularSalarioComBonus(bonus));
	}

	public static double calcularSalarioComBonus(double bonus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calcular Salário com Bônus ==");
		System.out.print("- Insira o salário: R$");
		double salario = sc.nextDouble();
		
		double conta = salario + bonus;
		
		return conta;
	}
}
