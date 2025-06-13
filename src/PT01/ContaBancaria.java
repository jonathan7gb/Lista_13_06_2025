package PT01;

public class ContaBancaria {

	double saldo =0.0;
	
	public void depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Você depositou " +valor+ " e sua conta bancária tem " +saldo+"R$ no momento");
	}
	
	public void sacar(double valor) {
		if (valor<=saldo) {
			saldo = saldo-valor;
			System.out.println("Você sacou " +valor+ " e sua conta bancária tem " +saldo+"R$ no momento");
		}else {
			System.out.println("Não é possível sacar, seu saldo não é compatível.");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setSaldo(200);
		conta1.depositar(40);
		conta1.sacar(30);
	}
	
}
