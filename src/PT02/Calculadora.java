package PT02;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String [ ] args) {
		
		int escolhaUser = menu();
		
		if(escolhaUser == 1) {
			System.out.println(somar());
		}else if(escolhaUser == 2 ){
			System.out.println(subtrair());
		}else if(escolhaUser == 3 ){
            System.out.println(multiplicar());
		}else if(escolhaUser == 4 ){
			System.out.println(dividir());
        }else{
            System.out.println("Escolha inválida");
        }
		
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calculadora ==");
		System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
		System.out.print("Sua escolha: ");
		int escolha = sc.nextInt();
		
		return escolha;
	}
	
	public static float somar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Somar ==");
		System.out.print("- Digite o 1º número: ");
		float num01 = sc.nextFloat();
		System.out.print("- Digite o 2º número: ");
		float num02 = sc.nextFloat();
		
		float conta = num01 + num02;
		
		return conta;
	}

	public static float subtrair() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Subtrair ==");
		System.out.print("- Digite o 1º número: ");
		float num01 = sc.nextFloat();
		System.out.print("- Digite o 2º número: ");
		float num02 = sc.nextFloat();
		
		float conta = num01 - num02;
		
		return conta;
	}

	public static float multiplicar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Multiplicar ==");
		System.out.print("- Digite o 1º número: ");
		float num01 = sc.nextFloat();
		System.out.print("- Digite o 2º número: ");
		float num02 = sc.nextFloat();
		
		float conta = num01* num02;
		
		return conta;
	}

	public static float dividir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Dividir ==");
        System.out.println("Atenção! O primeiro número deve ser maior ou igual o segundo!");
		System.out.print("- Digite o 1º número: ");
		float num01 = sc.nextFloat();
		System.out.print("- Digite o 2º número: ");
		float num02 = sc.nextFloat();
		
		float conta = num01 / num02;
		
		return conta;
	}


}
