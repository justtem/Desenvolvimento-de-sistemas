package ExercíciosJava;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op = 0, media;
		

		do {
			
			System.out.println(
					"-_-_-_ MENU -_-_-\n"
							+ "1- Calcular a média dos números\n"
							+ "2- Subtrair o menor número do maior\n"
							+ "3- Multiplicar os números\n"
							+ "4- Dividir o primeiro pelo segundo\n"		);
			
			do {
				System.out.println("Informe o primeiro valor: ");
				n1 = sc.nextInt();
				
			} while (n1 < 0);
			
			do {
				System.out.println("Informe o primeiro valor: ");
				n2 = sc.nextInt();
				
			} while (n2 < 0);
			
			System.out.println("Escolha uma das 4 opções: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				media =( n1 + n2) / 2;
				System.out.println("A media dos números: " + media);
				break;
			case 2:
				if (n1 > n2) {
					System.out.println("Subtração: " + (n1 - n2));
				} else {
					System.out.println("Subtração: " + (n2 - n1));
				}
				break;
			case 3:
				System.out.println("Multipicação: " + (n1 * n2));
				break;
			case 4:
				System.out.println("Divisão do primeiro pelo segundo: " + (n1 / n2));
				break;
			}
		} while (op != 4);
	}

}
