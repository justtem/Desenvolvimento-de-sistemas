package horario;

public class Principal {

	public static void main(String[] args) {
		Horario h1 = new Horario(20, 28, 36);
		
		h1.setHora(8);
		h1.setMinuto(15);
		h1.setSegundo(30);
		h1.exibir();
		System.out.println(h1.calcularSegundo());
		
		Horario h2 = new Horario();
		
		
		Horario h3 = new Horario(14, 20, 5);
		h3.exibir();
		System.out.println(h3.calcularSegundo());
	}

}
