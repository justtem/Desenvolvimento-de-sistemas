package Exercício4;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] temp = new double[7];
		double  maior = 0, menor = 0;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota");
			temp[i] = sc.nextDouble();
			maior = temp[0];
			menor = temp[0];
		}
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > maior) {
				maior = temp[i];
			} 
			
			if (temp[i] < menor) {
				menor = temp[i];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura: " + temp[i]);
		}
		
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
	}

}
