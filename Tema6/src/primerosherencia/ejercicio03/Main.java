package primerosherencia.ejercicio03;

public class Main {

	public static void main(String[] args) {
		double total;
		Producto pr = new Producto("Manzana", 1.5);
		NoPerecedero np = new NoPerecedero("Pasta", 1.90, "A");
		Perecedero pe = new Perecedero("Ensalada", 4, 4);
		System.out.println(pr);
		System.out.println(np);
		System.out.println(pe);
		System.out.println("==========");
		
		total = pr.calcular(5);
		System.out.println(total);
		
		total = np.calcular(5);
		System.out.println(total);
		
		total = pe.calcular(5);
		System.out.println(total);
		
		

	}

}
