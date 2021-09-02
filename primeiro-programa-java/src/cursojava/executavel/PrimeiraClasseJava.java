package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.contantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 5; qtd++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno?"); String rg
			 * = JOptionPane.showInputDialog("Qual RG do aluno?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String nomeMar =
			 * JOptionPane.showInputDialog("Qual o nome da mãe do aluno?"); String nomePai =
			 * JOptionPane.showInputDialog("Qual o nome do pai do aluno?"); String
			 * dataMatricula =
			 * JOptionPane.showInputDialog("Qual a data da matrícula do aluno?"); String
			 * nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
			 * String serieMatriculado =
			 * JOptionPane.showInputDialog("Qual a série matriculada do Aluno?");
			 */

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMar);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setNomeEscola(nomeEscola);
			 * aluno1.setSerieMatriculado(serieMatriculado);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota	 da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) { // SIM é igual a 0. NÃO é igual a 1
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina: 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		/* Separando as listas */
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("-------------------- Lista de Aprovados --------------------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(aluno.getNome() + "-> Resultado: " + aluno.getAlunoAprovado2() + " com média: " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------- Lista de Reprovados --------------------");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getNome() + "-> Resultado: " + aluno.getAlunoAprovado2() + " com média: " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------- Lista em Recuperação --------------------");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome() + "-> Resultado: " + aluno.getAlunoAprovado2() + " com média: " + aluno.getMediaNota());
		}
	}
}
