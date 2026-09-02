package Exercício1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		
		
		 do {
			 System.out.println("Informe uma tarefa: ");
			 tarefa = sc.nextLine();
			 
			 tarefas.add(tarefa);
			 
			 System.out.println("Cadastrar outra tarefa?(s ou n): ");
			 continuar = sc.nextLine();
			 
		 }while(continuar.equalsIgnoreCase("s"));
		 
		 System.out.println("\nTarefas cadastradas:");
		 
		 for (String tarefasCadastradas : tarefas) {
			 System.out.println(tarefasCadastradas);
		 }
	}

}
