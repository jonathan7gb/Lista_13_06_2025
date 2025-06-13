package PT01;

public class Lampada {

	boolean Ligada = false;
	
	public void Ligar() {
		Ligada = true;
		System.out.println("A lâmpada está Ligada");
	}
	
	public void Desligar() {
		Ligada = false;
		System.out.println("A lâmpada está Desligada");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada lampada1 = new Lampada();
		
		lampada1.Ligar();
		lampada1.Desligar();
	}
	
}
