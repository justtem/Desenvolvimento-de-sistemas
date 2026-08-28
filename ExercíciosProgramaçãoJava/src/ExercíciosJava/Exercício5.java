package ExercíciosJava;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Escolha um número de 1 a 5: ");
		int dia = sc.nextInt();
		switch (dia) {
		 	case 8:
		        System.out.println("Domingo");
		        break;
		    case 1:
		        System.out.println("Segunda-feira");
		        break;
		    case 2:
		        System.out.println("Terça-feira");
		        break;
		    case 3:
		        System.out.println("Quarta-feira");
		        break;
		    case 4:
		        System.out.println("Quinta-feira");
		        break;
		    case 5:
		        System.out.println("Sexta-feira");
		        break;
		    case 7:
		        System.out.println("Sabado");
		        break;
		    default:
		        System.out.println("Dia invalido");
		}

	}

}
