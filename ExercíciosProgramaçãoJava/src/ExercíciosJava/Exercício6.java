package ExercíciosJava;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Escolha um número de 1 a 5: ");
		int dia = sc.nextInt();
		switch (dia) {
		    case 1:
		        System.out.println("Janeiro");
		        break;
		    case 2:
		        System.out.println("Fevereiro");
		        break;
		    case 3:
		        System.out.println("Março");
		        break;
		    case 4:
		        System.out.println("Abril");
		        break;
		    case 5:
		        System.out.println("Maio");
		        break;
		    case 6:
		        System.out.println("Junho");
		        break;
		    case 7:
		        System.out.println("julho");
		        break;
		    case 8:
		        System.out.println("Agosto");
		        break;
		    case 9:
		        System.out.println("Setembro");
		        break;
		    case 10:
		        System.out.println("Outubro");
		        break;
		    case 11:
		        System.out.println("Novembro");
		        break;
		    case 12:
		        System.out.println("Outubro");
		        break;
		    default:
		        System.out.println("Ano invalido");
		}

	}

}
