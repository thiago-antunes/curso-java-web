package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // Aqui ser� o Joao
		aluno1.setNome("Jo�o da Silva");
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
		
		System.out.println("O nome do aluno 1 �: " + aluno1.getNome());
		System.out.println("O nome do aluno 1 �: " + aluno1.getIdade());
		System.out.println("O nome do aluno 1 �: " + aluno1.getDataNascimento());
		System.out.println("A m�dia das notas �: " + aluno1.getMediaNota());
		System.out.println("======================================================");
		
		Aluno aluno2 = new Aluno(); // Aqui ser� o Pedro
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("O nome do aluno 2 �: " + aluno2.getNome());
		System.out.println("O nome do aluno 2 �: " + aluno2.getIdade());
		System.out.println("O nome do aluno 2 �: " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno(); // Aqui ser� o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
		
	}

}
