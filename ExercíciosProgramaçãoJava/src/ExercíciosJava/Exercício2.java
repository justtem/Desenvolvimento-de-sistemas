package ExercíciosJava;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Informe uma idade de um nadador: ");
        int idade = sc.nextInt();
        
        
        if (idade >+ 5 && idade <= 7) {
        	System.out.println("Nenhuma categoria.");
        }  else if (idade <= 8 && idade <= 10) {
        	System.out.println("Jun=venil");
        } else if (idade <= 11 && idade <= 16) {
        	System.out.println("Adolescente");
        } else if (idade <= 16 && idade <= 30) {
        	System.out.println("Adulto");
        } else {
        	System.out.println("Sênior");
        }
	}

}
