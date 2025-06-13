package PT01.Q08;

public class CalculadoraSimples {

	public void somar (int a, int b) {
		System.out.println("Realizando a soma...");
		int resultado = a+b;
		System.out.println("Resultado da soma: "+resultado);
	}
	
		public static void main (String[]args) {
			CalculadoraSimples calculadora = new CalculadoraSimples();
			calculadora.somar(10, 5);
		}
}
