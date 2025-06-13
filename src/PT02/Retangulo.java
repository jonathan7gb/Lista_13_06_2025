package PT02;

import java.util.Scanner;

public class Retangulo {
	
	public static void main(String [ ] args) {
		
		int escolhaUser = menu();
		
		if(escolhaUser == 1) {
			System.out.println(area());
		}else if(escolhaUser == 2 ){
			System.out.println(perimetro());
        }else{
            System.out.println("Escolha inválida");
        }
		
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calculadora ==");
		System.out.println("1 - Calcular Área\n2 - Calcular Perímetro");
		System.out.print("Sua escolha: ");
		int escolha = sc.nextInt();
		
		return escolha;
	}
	
	public static float area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calcular Área ==");
		System.out.print("- Digite a largura: ");
		float area = sc.nextFloat();
		System.out.print("- Digite o comprimento: ");
		float comprimento = sc.nextFloat();
		
		float conta = area * comprimento;
		
		return conta;
	}
	
	public static float perimetro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Calcular Perímetro ==");
		System.out.print("- Digite a largura: ");
		float area = sc.nextFloat();
		System.out.print("- Digite o comprimento: ");
		float comprimento = sc.nextFloat();
		
		float conta = area + comprimento;
		
		return conta;
	}

	



}
