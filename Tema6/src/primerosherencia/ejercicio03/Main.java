package primerosherencia.ejercicio03;

public class Main {

	public static void main(String[] args) {
		Producto pr = new Producto("Manzana", 1.5);
		NoPerecedero np = new NoPerecedero("Pasta", 1.90, "A");
		Perecedero pe = new Perecedero("Ensalada", 94.3, 3);
		System.out.println(pr);
		System.out.println(np);
		System.out.println(pe);

	}

}
