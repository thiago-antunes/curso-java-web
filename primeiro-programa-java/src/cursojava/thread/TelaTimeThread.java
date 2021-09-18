package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	private static final long serialVersionUID = 1L;

	public TelaTimeThread() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true); /* Exibe a tela para o usu�rio. Sempre deve ser o �ltimo a ser executado */
	}
}
