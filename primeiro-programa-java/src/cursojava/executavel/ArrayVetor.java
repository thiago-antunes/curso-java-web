package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };

		Aluno aluno = new Aluno();
		aluno.setNome("Thiago Antunes Ribeiro");
		aluno.setNomeEscola("JDEV Treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de Programa��o");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno arrayAlunos[] = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome()	);
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina �: " + d.getDisciplina());
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota n�mero " + posnota + " � igual = " + d.getNota()[posnota]);
				}
			}
		}
		

	}

}
