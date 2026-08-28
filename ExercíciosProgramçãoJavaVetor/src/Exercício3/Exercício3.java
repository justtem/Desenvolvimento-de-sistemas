package Exercício3;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0, media;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota");
			notas[i] = sc.nextDouble();
			soma+=notas[i];
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas cadastradas: " + notas[i]);
		}
		
		media = soma/notas.length;
		System.out.println("Media: " + media);
		
		sc.close();
	}

}
