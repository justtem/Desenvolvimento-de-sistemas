package senai;

public class Principal {

	public static void main(String[] args) {
		Departamento dp1 = new Departamento(0123456, "Tecnologia da Informação", "T.I", "24992065889");
		
		Departamento dp2 = new Departamento(0123456, "Administração", "Administrar", "3199865932015");
		
		Funcionario f1 = new Funcionario(01, "Lucas", "T.I", 1500);
		Funcionario f2 = new Funcionario(02, "Angela", "ADM", 1612);
		Funcionario f3 = new Funcionario(03, "Carlos", "Operador de maquina", 1412);
		Funcionario f4 = new Funcionario(04, "Adrea", "Oficila de limpez", 1300);
		
		dp1.adiconarFuncionario(f1);
		dp1.adiconarFuncionario(f3);
		dp2.adiconarFuncionario(f2);
		dp2.adiconarFuncionario(f4);
		
		Unidade und = new Unidade("Senai Valença", null);
		und.adicionarDepartamento(dp1);
		und.adicionarDepartamento(dp2);
		
		und.exibirEstrutura();

	}

}
