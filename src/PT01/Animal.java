package PT01;

public class Animal {

	private String nome;
	
	public Animal (String nome){
		this.nome = nome;
	}
	
	public void emitirSom () {
		System.out.print("Engel - ");
		System.out.println("Que barulho é esse?");
		System.out.print("Kauã - ");
		System.out.println("É o som que o "+nome+" faz");
	}
	
	public static void main (String[]args) {
		Animal animal = new Animal ("ANU");
		animal.emitirSom();
	}
}
