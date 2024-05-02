package interfaces.ejercicio03;

public class Main {

	public static void main(String[] args) {
		Perro p = new Perro();
		Gato g = new Gato();
		
		System.out.println("GATO");
		g.hacerRuido();
		System.out.println(g.hacerCaso());
		System.out.println("========");
		System.out.println("Perro");
		p.hacerRuido();
		System.out.println(p.hacerCaso());
		System.out.println("========");

	}

}
