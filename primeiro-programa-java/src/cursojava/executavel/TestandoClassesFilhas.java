package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago");
		aluno.setNomeEscola("JDEV Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1375789");
		diretor.setNome("Alex");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("01647600162");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}
}
