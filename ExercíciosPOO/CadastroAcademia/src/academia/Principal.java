package academia;

public class Principal {

	public static void main(String[] args) {
		AlunoAcademia aluno1 = new AlunoAcademia("Carlos", 17, 18, 1.67);
		AlunoAcademia aluno2 = new AlunoAcademia("Ana", 16, 15, 1.60);
		
		aluno1.exibirDados();
		System.out.printf("IMC: %.2f", aluno1.calcularIMC(aluno1.getPeso(), aluno1.getAltura()), "\n");
		
		aluno2.exibirDados();
		aluno2.setPeso(78);
		System.out.printf("IMC: %.2f", aluno2.calcularIMC(aluno2.getPeso(), aluno2.getAltura()));
		
	}

}
