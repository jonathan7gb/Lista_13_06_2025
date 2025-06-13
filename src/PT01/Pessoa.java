package PT01;

import java.util.Scanner;
public class Pessoa {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		
		public void mostrarDados() {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Pessoa pessoa1 = new Pessoa();
			
			pessoa1.setNome("Matheus Engel");
			pessoa1.setIdade(17);
			
			pessoa1.mostrarDados();
		}
		
		
	}

