package ExercíciosJava;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        
        System.out.println("Informe o valor da base do triângulo: ");
        double base = sc.nextDouble();
        
        System.out.println("Informe o valor da altura do triângulo: ");
        double altura = sc.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("A área do triângulo e: " + area);
	}

}
