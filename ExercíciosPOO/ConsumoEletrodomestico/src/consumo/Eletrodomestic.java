package consumo;

public class Eletrodomestic {
	String nome;
	double potenciaWatts;
	double horasPorDia;
	
	public Eletrodomestic(String nome, double potenciaWatts, double horasPorDia) {
		super();
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
	}

	public Eletrodomestic() {
		super();
		this.nome = "";
		this.potenciaWatts = 0;
		this.horasPorDia = 0;
	}

	public double consumoDiarioWh() {
		return potenciaWatts * horasPorDia;
	}
	
	public double consumoMensalWh() {
		return ((potenciaWatts * horasPorDia) * 30);
	}
	
	public double consumoAnualWh() {
		return ((potenciaWatts * horasPorDia) * 30) * 12;
	}
	
	public double gastoMensal(double precoKwh) {
		return ((consumoMensalWh() / 100) * precoKwh);
	}
	
	public void exibirRelatorio(double precoKwh) {
		System.out.println("\nDados De Eletrodomesticos\n"
				+ "Nome: " + nome + "\n"
				+ "Potencia em Watts: " + potenciaWatts + "\n"
				+ "Horas por dia: " + horasPorDia + "\n"
				+ "Consumo diario: " + consumoDiarioWh() + "\n"
			    + "Consumo Mensal: " + consumoMensalWh() + "\n"
			    + "Consumo anual: " + consumoAnualWh() + "\n"
			    + "Gasto Mensal: " + gastoMensal(precoKwh) + "\n");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome.isEmpty()) {
			System.out.println("Nome invalido.");
		} else { 
			this.nome = nome;			
		}
	}

	public double getPotenciaWatts() {
		return potenciaWatts;
	}

	public void setPotenciaWatts(double potenciaWatts) {
		if (this.potenciaWatts < 0) {
			System.out.println("Invalido.");
		} else {
			this.potenciaWatts = potenciaWatts;
		}
		
	}

	public double getHorasPorDia() {
		return horasPorDia;
	}

	public void setHorasPorDia(double horasPorDia) {
		if (this.horasPorDia > 24 || this.horasPorDia < 0) {
			System.out.println("Hora invalida.");
		} else {
			this.horasPorDia = horasPorDia;
		}
		
	}
	
}
