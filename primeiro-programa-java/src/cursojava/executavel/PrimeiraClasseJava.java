package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String rg = JOptionPane.showInputDialog("Qual RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMar = JOptionPane.showInputDialog("Qual o nome da m�e do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a s�ria matriculado do aluno?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno?");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMar);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("O nome do aluno 1 �: " + aluno1.getNome());
		System.out.println("A idade do aluno �: " + aluno1.getIdade());
		System.out.println("Nome da m�e do aluno: " + aluno1.getNomeMae());
		System.out.println("A data de nascimento do aluno 1 �: " + aluno1.getDataNascimento());
		System.out.println("A m�dia das notas �: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("======================================================");
		
	}

}
