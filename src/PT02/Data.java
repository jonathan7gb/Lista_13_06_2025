package PT02;

import java.util.Scanner;

public class Data {
	
	public static void main(String [ ] args) {
		
		System.out.println("- Data Formatada: " + formatarData());
	}

	public static String formatarData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== Formatar Data ==");
		System.out.print("- Insira o dia: ");
		int dia = sc.nextInt();
		System.out.print("- Insira o mês: ");
		int mes = sc.nextInt();
		System.out.print("- Insira o ano: ");
		int ano = sc.nextInt();
		
		String dataFormatada = dia + "/" + mes + "/" + ano;
		
		return dataFormatada;
	}
}
