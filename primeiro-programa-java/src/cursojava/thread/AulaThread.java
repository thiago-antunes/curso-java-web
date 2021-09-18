package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Envio de e-mail */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/* Envio de nota fiscal */
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		System.out.println("########## CONTINUAÇÃO DO FLUXO ##########");
		
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do código de teste de Thread!");
		
		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
	}

	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {
				/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina (Ex: envio de e-mail)");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/* Fim do código em paralelo */
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {
				/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina (Ex: envio de nota fiscal)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/* Fim do código em paralelo */
		}
	};
}
