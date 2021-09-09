package cursojava.executavel;

public class ArrayVetor {

	public static void main(String[] args) {

		double notas[] = new double[5];
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
		}
	}

}
