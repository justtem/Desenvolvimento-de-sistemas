package ExercíciosJava;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int n = sc.nextInt();
		
		if (n > 20) System.out.println(n +" e maior que 20");
		else {
			System.out.println(n + " não e maior que 20");
		}
	}

}
