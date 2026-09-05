package senai;

import java.util.ArrayList;

public class Unidade {
	String nome;
	ArrayList<Departamento> departamentos;
	
	
	public Unidade(String nome, ArrayList<Departamento> departamentos) {
		super();
		this.nome = nome;
		this.departamentos =new ArrayList<>();;
	}
	
	public void adicionarDepartamento(Departamento departamento) {
			departamentos.add(departamento);
	}
	
	public void exibirEstrutura() {
		System.out.println("Setor: " + nome);
		
		for (Departamento d : departamentos) {
			d.exibirDados();
			d.ListaFuncionario();
		}
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome invalido");
		else this.nome = nome;

	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
}
