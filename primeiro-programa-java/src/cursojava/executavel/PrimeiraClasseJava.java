package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("111111111");
		aluno1.setNumeroCpf("333.333.333-33");
		aluno1.setNomeMae("Sandra");
		aluno1.setNomePai("Junior");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("O nome do aluno 1 é: " + aluno1.getNome());
		System.out.println("O nome do aluno 1 é: " + aluno1.getIdade());
		System.out.println("O nome do aluno 1 é: " + aluno1.getDataNascimento());
		System.out.println("A média das notas é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("======================================================");
		
	}

}
