package senai;

public class Funcionario {
   int codigo;
   String nome;
   String funcao;
   double salario;
   
   
   public Funcionario(int codigo, String nome, String funcao, double salario) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.funcao = funcao;
	this.salario = salario;
   }



   public void exibirDadosF() {
	   System.out.println("\n=== Funcionario ===\n"
		 		+ "Nome: " + nome + "\n"
		 		+ "Codigo: " + codigo + "\n"
		 		+ "Salario: " + salario + "\n"
		 		+ "Função: " + funcao + "\n");
   }
   

   public int getCodigo() {
	return codigo;
   }

   public void setCodigo(int codigo) {
	if (this.codigo < 0) System.out.println("Codigo invalido");
	else this.codigo = codigo;
 
   }

   public String getNome() {
	return nome;
   }

   public void setNome(String nome) {
	   if (this.nome.isEmpty()) System.out.println("Nome invalido");
	   else this.nome = nome;
	   
   }

   public String getFuncao() {
	return funcao;
   }

   public void setFuncao(String funcao) {
	   if (this.funcao.isEmpty()) System.out.println("Função invalida");
	   else this.funcao = funcao;
   }

   public double getSalario() {
	return salario;
   }

   public void setSalario(double salario) {
	   if (this.salario < 0) System.out.println("Salario invalido");
	   else this.salario = salario;
   }
     
   
}
