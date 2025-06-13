package PT02;

import java.util.Scanner;

public class ContaBancaria {
	
	public static void main(String [ ] args) {	
		
		System.out.println("- Saldo: " + consultarSaldo());
	}
	
	public static float consultarSaldo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Consultar Saldo ==");
		System.out.print("- Digite seu Saldo: R$");
		float saldo = sc.nextFloat();
		
		return saldo;
	}
}
