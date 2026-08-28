package ExercíciosJava;

import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nC = 3000, nJ = (nC / 3);
		int meses = 0;
		
		while (nJ < nC) {
		   nC = nC * 1.02;
		   nJ = nJ * 1.05;
		   meses++;
		}
		
		System.out.println("Carlos : R$ " + nC);
		System.out.println("João: R$ " + nJ);
		System.out.println("Meses: " + meses);
		
	}

}
