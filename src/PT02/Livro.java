package PT02;

import java.util.Scanner;

public class Livro {
	
	public static void main(String [ ] args) {
		
		System.out.println("- Título do Livro: " + getTitulo());
	}

	public static String getTitulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Título Livro ==");
		System.out.print("- Insira o título do livro: ");
		String titulo = sc.nextLine();
		
		return titulo;
	}
}
