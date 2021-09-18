package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	private JLabel descricaoHora= new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	private JLabel descricaoHora2= new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	/* Construtor da tela */
	public TelaTimeThread() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		setResizable(false);
		/* Parte inicial concluída */
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true); /* Exibe a tela para o usuário. Sempre deve ser o último a ser executado */
	}
}
