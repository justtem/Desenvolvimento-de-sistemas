package ExercíciosJava;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, salario;
		
		do {
			System.out.println("Informe o valor salario: ");
			salario = sc.nextInt();
			
		} while (salario < 0);
		
		do {
			
			System.out.println(
					"-_-_- MENU _-_-_\n"
							+ "1- Imposto sobre salário\n"
							+ "2- Novo salário sobre aumento\n"
							+ "3- Classificação do salário\n"
							+ "4- Finalizar o programa\n");
			
			
			System.out.println("Informe a opção: ");
			op = sc.nextInt();
			
			switch (op) {	
			case 1:
				if (salario < 500) {
					double imposto = salario * 0.5;
					System.out.println("Valor do imposto: " + imposto);
				} else if (salario < 850) {
					double imposto = salario * 0.10;
					System.out.println("Valor do imposto: " + imposto);
				} else {
					double imposto = salario * 0.15;
					System.out.println("Valor do imposto: " + imposto);
				}
				break;
			case 2:
				if (salario > 1500) {
					salario = salario + 250;
					System.out.println("Novo salário de: " + salario);
				} else if (salario > 750) {
					salario = salario + 50;
					System.out.println("Novo salário de: " + salario);
				} else if (salario > 450) {
					salario = salario + 75;
					System.out.println("Novo salário de: " + salario);
				} else {
					salario = salario + 100;
					System.out.println("Novo salário: " + salario);
				}
				break;
			case 3:
				if (salario < 700) {
					System.out.println("Mal remunerado");
				} else if (salario > 700) {
					System.out.println("Bem remunerado");
				}
				break;
			} while (op != 4);
		} while (op != 4);
	}

}