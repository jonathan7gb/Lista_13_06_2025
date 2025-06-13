package PT01;
import java.util.Scanner;
public class Carro {

	Scanner leia = new Scanner(System.in);
	
	String modelo;
	double velocidade;
	
	public void acelerar() {
		velocidade = velocidade+10;
			System.out.println("A velocidade do carro " +modelo+" é de:"+ velocidade); 
		
		}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro1 = new Carro();
		
		carro1.setModelo("BYD");
		carro1.setVelocidade(80.03);
		
		carro1.acelerar();
	}

}

