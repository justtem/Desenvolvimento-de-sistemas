package Exercício2;
import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[5];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a " + (i + 1) + "º nota: ");
		    notas[i] = sc.nextDouble();	
		}
		
		
		for (int i = 0; i <= notas.length; i++) {
			System.out.println("Numeros cadastrados " + i + ": " + notas[i]);
		}
		
		sc.close();
	}

}
