package PT01;

public class Produto {
	private double preco;
	
	public Produto (double preco) {
		this.preco = preco;
	}

	
	public void exibirPreco() {
		System.out.println("Exibindo o preço do Produto... ");
		System.out.println("Preço do Produto: R$"+preco);
	}
	
	public static void main (String[]args) {
		Produto produto = new Produto (50);
		produto.exibirPreco();
	}
}
