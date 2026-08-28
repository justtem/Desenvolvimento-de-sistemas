package ExercíciosJava;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
         
		do {
			System.out.println("Informe um número: ");
			n = sc.nextInt();
			
		} while (n <= 0 );
		
		for (int i = 1; i <= 10; i++) {
        	System.out.println(n + " X " + i + " = " + (n * i));
        }
		
	}

}
