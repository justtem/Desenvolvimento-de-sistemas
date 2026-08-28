package ExercíciosJava;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double n, cubo, quadrado, raiz;
		 
		 do {
			 System.out.println("Informe um valor: ");
			 n = sc.nextInt();
			 
			 quadrado = Math.pow(n ,2);
			 System.out.println("O quadrado do número: " + quadrado);
			 
			 cubo = Math.pow(n,3);
			 System.out.println("O cubo do número: " + cubo);
			 
			 raiz = Math.sqrt(n);
			 System.out.println("A raiz do número: " + raiz);
			 
		 } while (n > 0);
	}

}
