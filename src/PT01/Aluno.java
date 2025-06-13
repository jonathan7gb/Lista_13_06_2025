package PT01;
import java.util.Scanner;
public class Aluno {

	Scanner leia = new Scanner(System.in);
	String nome;
	double nota;
	
	public void verificarAprovacao() {
		if(nota>=7) {
			System.out.println("O aluno "+ nome +" está aprovado!");
		}else {
				System.out.println("O aluno "+ nome +" está Reprovado!");
			}
		}
	
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public double getNota() {
			return nota;
		}
		
		public void setNota(double nota) {
			this.nota = nota;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome("Jotalu");
			aluno1.setNota(9.25);
			
			aluno1.verificarAprovacao();
		}
}

