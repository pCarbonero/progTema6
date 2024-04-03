package primerosherencia.ejercicio02;

public class Main {

	public static void main(String[] args) {
		// 
		Empleado em = new Empleado("Mateo");
		Operario op = new Operario("Marcos");
		Directivo di = new Directivo("Pedro");
		Oficial of = new Oficial("Jesús");
		Tecnico te = new Tecnico("Judas");

		System.out.println(em);
		System.out.println(op);
		System.out.println(di);
		System.out.println(of);
		System.out.println(te);
	}

}
