package senai;

import java.util.ArrayList;

public class Departamento {
	int codigo;
	String telefone;
	String nome;
	ArrayList<Funcionario> funcionarios;
	
	 public Departamento(int codigo, String nome, String funcao, String telefone) {
			super();
			this.funcionarios = new ArrayList<>();
			this.codigo = codigo;
			this.nome = nome;
			this.telefone = telefone;
		}
	 
	 public void adiconarFuncionario(Funcionario funcionario) {
		 funcionarios.add(funcionario);
	 }
	 
	 public void exibirDados() {
		 System.out.println("\n=== Departamento ===\n"
		 		+ "Nome: " + nome + "\n"
		 		+ "Codigo: " + codigo + "\n"
		 		+ "Telefone: " + telefone + "\n");
	 }
	 
	 public void ListaFuncionario() {
		 for (Funcionario f : funcionarios) {
			 System.out.println("");
			 f.exibirDadosF();
		 }
	 }

	 
	 public int getCodigo() {
		 return codigo;
	 }

	 public void setCodigo(int codigo) {
		 if (this.codigo < 0) System.out.println("Codigo invalido");
		 else this.codigo = codigo;
		
	 }

	 public String getTelefone() {
		 return telefone;
	 }

	 public void setTelefone(String telefone) {
		 if (this.telefone.isEmpty()) System.out.println("Telefone invalido");
		 else this.telefone = telefone;
	 }

	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) {
		 if (this.nome.isEmpty()) System.out.println("Nome invalido");
		   else this.nome = nome;
	 }

	 public ArrayList<Funcionario> getFuncionarios() {
		 return funcionarios;
	 }

	 public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		 this.funcionarios = funcionarios;
	 }
	 
	 
	 
}
