package Exercício5;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[8];
		int par = 0, impar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um número inteiro: ");
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0) par++;
			else impar++;
			
		}
		
		
		for (int i = 0; i < vetor.length; i++) {
			String resultado = (vetor[i] % 2 == 0 ? "par" : "impar");
			System.out.printf("Número %d %s\n " , vetor[i], resultado);
		}
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
		
	}

}
