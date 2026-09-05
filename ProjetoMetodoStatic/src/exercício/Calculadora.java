package exercício;

import java.util.Scanner;

public class Calculadora {
	public static double somar(double a, double b) {
		double somar = a + b;
		return somar;
	}
	
	public static double subtrair(double a, double b) {
		double subtrair = a - b;
		return subtrair;
	}
	
	public static double multiplicar(double a, double b) {
		double multiplicar = a * b;
		return multiplicar;
	}
	
	public static double maiorNumero( double a, double b) {
		double maior = 0;
		if (a > b) {
			a = maior;
		} else {
			b = maior;
		}
		
		return maior;
	}
	
	public static double lerNumero(Scanner sc, String mensagem) {
		while(true) {
		System.out.println(mensagem);
		String entrada = sc.nextLine().trim();
		if (entrada.isEmpty()) {
		return 0;
		}
		try {
		return Double.parseDouble(entrada);
		} catch (NumberFormatException e) {
		System.out.println("ERRO: Entrada Inválida");
		}
		}
		}

}
