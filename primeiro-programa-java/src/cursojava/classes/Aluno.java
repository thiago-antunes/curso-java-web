package cursojava.classes;

/* Classe que representa cada aluno */
public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	public Aluno() {
		// TODO Construtor padrão
	}
	
	public Aluno(String nomePadrao) {
		this.nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
	}
}
