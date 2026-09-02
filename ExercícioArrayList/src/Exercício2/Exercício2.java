package Exercício2;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercício2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();
        String nome, novoNome;
        int op, posicao;
        
        System.out.println("hello");
        
        do {
        	System.out.println(
        			"\n=== MENU DE OPÇÕES ===\n"
        					+ "1 - Adicionar convidado\n"
        					+ "2 - Alterar convidado\n"
        					+ "3 - Remover convidado\n"
        					+ "4 - Procurar convidado\n"
        					+ "5 - Exibir convidados\n"
        					+ "6 - encerrar");
        	System.out.println("Escolha uma das opções abaixo: ");
        	op = Integer.parseInt(sc.nextLine());
        	
        	if (op == 1 ) {
        		System.out.println("Insira um nome: ");
        		convidados.add( sc.nextLine());
        		
        	} else if (op == 2) {
        		System.out.println("Informe a posição: ");
        		posicao = sc.nextInt();
        
        		if ((convidados.size() - 1)  <= posicao) {
        			System.out.println("Informe a posição e o novo nome: ");
            		novoNome = sc.nextLine();
            		convidados.set(posicao, novoNome);
        		}
        		
                } else if (op == 3 ) {
        		System.out.println("Informe um nome para verificar a existência: ");
        		nome = sc.nextLine();
        		convidados.contains(nome);
        		
        		if (convidados.contains(nome)) {
        			convidados.remove(convidados.indexOf(nome));
        		} else {
        			System.out.println("Nome não encontrado.");
        		}
        		
        	} else if  (op == 4 ) {
        		System.out.println("Informe um nome: ");
        		nome = sc.nextLine();
        		System.out.println(convidados.indexOf(nome));
        		
        	} else if (op == 5 ) {
        		for (String n : convidados) {
        			System.out.println(n);
        		}
        	}
        } while(op != 6);
	}

}
