package horario;

public class Horario {
	int hora, minuto, segundo;

	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Horario() {
		super();
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	public void exibir() {
		System.out.printf("\n%02d:%02d:%02d\n", hora, minuto, segundo);
	}
	
	public int calcularSegundo() {
		return ((hora * 3600) + (minuto * 60) + segundo);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (this.hora >= 24 || this.hora < 0) {
			System.out.println("capotemo o corsa");
		} else {
			this.hora = hora;			
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (this.minuto >= 60 || this.hora < 0) {
			System.out.println("capotemo a uno");
		} else {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (this.minuto >= 60 || this.hora < 0) {
			System.out.println("capotemo a saveiro");
		} else {
			this.segundo = segundo;
		}
	}
	
	
	
	
}
