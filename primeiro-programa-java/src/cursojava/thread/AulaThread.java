package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		for (int pos = 0; pos < 10; pos++) {
			/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
			System.out.println("Executando alguma rotina (Ex: envio de e-mail)");
			Thread.sleep(1000);
		}
		
		System.out.println("Chegou ao fim do c�digo de teste de Thread!");
	}

}
