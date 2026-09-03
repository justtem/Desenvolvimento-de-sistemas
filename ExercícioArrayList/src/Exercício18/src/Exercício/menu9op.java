package Exercício;

import java.util.Scanner;
import java.util.ArrayList;

public class menu9op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		int op;

		do {
			System.out.println("" + "\n-_-_ MENU -_-_\n" + "1 - Cadastrar aluno\n" + "2 - Listar alumos\n"
					+ "3 - Procurar aluno\n" + "4 - Alterar nota\n" + "5 - Remover aluno" + "6 - Exibir media da turma"
					+ "7 - Exibir maior e menor nota\n" + "8 - Exibir situação dos alunos\n" + "9 - Encerrar\n");

			op = Integer.parseInt(sc.nextLine());

			switch (op) {
				case 1:
					System.out.println("Escreva o nome do aluno: ");
					alunos.add(sc.nextLine());
					
					double nota;
	             do {
	            	 System.out.println("Informe a nota do aluno: ");
	            	 nota = Double.parseDouble(sc.nextLine());
	            	 
	             } while (nota < 0 || nota > 10);
	             notas.add(nota);
	             
					break;
				case 2:
					System.out.println("Lista de alunos: \n");
	
					for (int i = 0; i < alunos.size(); i++) {
						System.out.println("Posição " + i + " - " + alunos + " - " + "Nota: " + notas);
					}
					break;
				case 3:
					System.out.println("Informe o nome do aluno: ");
					String nome = sc.nextLine();
	
					if (alunos.contains(nome))
						System.out.println(alunos);
					else
						System.out.println("Aluno não encontrado");
					break;
			
			    case 4:
			    	System.out.println("Informe o nome do aluno: ");
			    	String nome4 = sc.nextLine();
			    	int posicao;
			    	posicao = alunos.indexOf(nome4);
			    	
			    	if (alunos.contains(nome4)) {
			    		System.out.println("aluno encontrado, Posição: " + posicao);
			    	} else {
			    		System.out.println("Aluno não enncontrado");
			    	}
			    	
			    	System.out.printf("Nome: %s\n " + "Nota atual: %.2f\n" + "Informe a nova nota: ", nome4, notas.get(posicao));
			    	
			    	notas.set(posicao, Double.parseDouble(sc.nextLine()));
			    	break;	
			    	
			    case 5: 
			    	int posicao5;
			    	System.out.println("Informe o nome do aluno para removelo: ");
			    	posicao5 = sc.nextInt(); 	
			    	
			    	if (posicao5 > alunos.size() - 1) {
			    		System.out.println("Aluno enontrado com êxito");
			    		break;
			    	}
			        
			    	alunos.remove(posicao5);
			    	notas.remove(posicao5);
			    	System.out.println("Aluno removido com êxito!");
			    	
			    	break;
			    	
			    case 6:
			    	if (notas.isEmpty()) {
			    		System.out.println("Lista Vazia.");
			    		break;
			    	}
			    	
			    	double soma = 0, media;
			    	
			    	for (double nota6 : notas) {
			    		soma += nota6;
			    	}
			    	
			    	media =soma / notas.size();
			    	
			    	System.out.printf("Média: %.2f\n", media);
			    	
			    	break;
			    	
			    case 7:
			    	double menorNota = notas.get(0), maiorNota = notas.get(0);
			    	
			    	for (double nota7 : notas) {
			    		if (nota7 > maiorNota) maiorNota = nota7;
			    		if (nota7 < menorNota) menorNota = nota7;
			    	}
			    	System.out.printf("Maior nota: %.2f", maiorNota, "\n", "Menor nota: %.2f", menorNota);
			    	
			    	break;
			   case 8: 
				   System.out.println("Situação dos alunos: ");
				   
				   for (int i = 0; i < alunos.size(); i++) {
					   if (notas.get(i) >= 7) System.out.println("Nome: " + alunos.get(i) + "Situação aprovado.");
					   else if (notas.get(i) < 5) System.out.println("Nome: " + alunos.get(i) + "Situção de recuperação.");
					   else System.out.println("Nome: " + alunos.get(i) + "Situação Reprovado.");
				   }
				   break;
			       }
		} while (op != 9);
		sc.close();

	}

}
