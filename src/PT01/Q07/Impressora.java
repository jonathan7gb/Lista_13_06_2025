package PT01.Q07;

public class Impressora {

		public void imprimirDocumento(String documento) {
			System.out.println("Imprimindo documento...");
			System.out.println(documento);
		
			
	}
			public static void main (String[]args) {
				Impressora impressora = new Impressora();
				impressora.imprimirDocumento ("O Professor Bruno faltou na aula hoje.");
			
			}
}
