package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};

		Aluno aluno = new Aluno();
		aluno.setNome("Thiago Antunes Ribeiro");
		aluno.setNomeEscola("JDEV Treinamento");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("------- Disciplinas do aluno -------");
		
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("\nDisciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			double notaMax = 0.0;
			for (int pos = 1; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + ": " + d.getNota()[pos]);
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				} else {
					if(d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é: " + notaMax);
			
			double notaMin = 1000.00;
			for (int pos = 1; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + ": " + d.getNota()[pos]);
				if(pos == 0) {
					notaMin = d.getNota()[pos];
				} else {
					if(d.getNota()[pos] < notaMin) {
						notaMin = d.getNota()[pos];
					}
				}
			}
			System.out.println("A menor nota da disciplina " + d.getDisciplina() + " é: " + notaMin);
		}
	}

}
