package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Envio de e-mail */
		new Thread() {
			public void run() {
				/* C�digo da rotina que eu quero executar em paralelo */
				for (int pos = 0; pos < 10; pos++) {
					/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
					System.out.println("Executando alguma rotina (Ex: envio de e-mail)");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				/* Fim do c�digo em paralelo */
			};
		}.start();
		
		System.out.println("########## DIVIS�O DAS THREADS ##########");
		
		/* Envio de nota fiscal */
		new Thread() {
			public void run() {
				/* C�digo da rotina que eu quero executar em paralelo */
				for (int pos = 0; pos < 10; pos++) {
					/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
					System.out.println("Executando alguma rotina (Ex: envio de nota fiscal)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				/* Fim do c�digo em paralelo */
			};
		}.start();
		
		System.out.println("########## CONTINUA��O DO FLUXO ##########");
		
		/* C�digo do sistema do usu�rio continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do c�digo de teste de Thread!");
		
		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio.");
	}

}
