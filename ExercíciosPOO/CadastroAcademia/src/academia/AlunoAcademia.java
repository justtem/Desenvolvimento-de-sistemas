package academia;

public class AlunoAcademia {
	String nome;
	int idade;
	double peso; //Informado em quilogramas
	double altura; //Informado em metros
	
	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public boolean ehMenorIdade() {
		if (this.idade < 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double calcularIMC(double peso, double altura) {
		
		if (altura < 0 || peso < 0 ) {
			System.out.println("Invalido.");
			return 0;
		} else {
			return (peso / Math.pow(altura, 2));			
		}
	}
	
	
	public void exibirDados() {
		System.out.println("\nDados do aluno: \n"
				+ "nome: " + this.nome + "\n"
				+ "Idade: " + this.idade + "\n"
				+ "Peso: " + this.peso + "\n"
				+ "Altura: " + this.altura + "\n"
				+ "Direito a desconto: " + ((this.idade < 18) ? "Tem o benefício" : "Não tem o benefício"));
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome invalido.");
		} else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 4) {
			System.out.println("idade invalido.");
		} else {
			this.idade = idade;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("Peso invalido.");
		} else {
			this.peso = peso;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 1) {
			System.out.println("altura invalido.");
		} else {
			this.altura = altura;
		}
	}
	
	
	
	
	
}
