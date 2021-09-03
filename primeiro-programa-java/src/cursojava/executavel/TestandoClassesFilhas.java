package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago");
		aluno.setNomeEscola("JDEV Treinamento");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1375789");
		diretor.setNome("Alex");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Allan");
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("01647600162");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio Aluno = " + aluno.salario());
		System.out.println("Sal�rio Diretor = " + diretor.salario());
		System.out.println("Sal�rio Secret�rio= " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + " e o sal�rio � de = " + pessoa.salario());
	}
}
