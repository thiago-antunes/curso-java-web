package cursojava.classes;

import java.util.Arrays;

public class Disciplina {

	private String disciplina;
	private double[] notas = new double[4];

	/* Métodos getters e setters */
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNota() {
		return notas;
	}

	public void setNota(double[] nota) {
		this.notas = nota;
	}
	
	public double getMediaNotas() {
		double somaTotal = 0.0;
		for (int pos = 0; pos < notas.length; pos++) {
			somaTotal += notas[pos];
		}
		return somaTotal / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + notas + "]";
	}

}
