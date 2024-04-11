package abstractas.ejercicio01;

import java.util.Scanner;

public class Main {
	// scasnner
	static Scanner sc = new Scanner(System.in);
	// array de objetos
	static Poligono[] figuras = new Poligono[10];
	public static void main(String[] args) {
		
		int opc = 0;
		
		do {
			menu();
			System.out.println("Escribe una opcion");
			opc = sc.nextInt();
			// 
			switch (opc) {
			case 1: {
				creaTriangulo();
				break;
			}
			case 2: {
				creaRectangulo();
				break;
			}
			case 3: {
				//
				imprimeArray();
				break;
			}
			case 4: {
				// salir
				break;
			}
				default: System.out.println("Opcion no válida ");
			}
		} while (opc != 4);

	}// main
	
	public static void menu() {
		System.out.println("===============");
		System.out.println("MENU");
		System.out.println("1. Introducir triángulo.\r\n"
				+ "2. Introducir rectángulo.\r\n"
				+ "3. Mostrar contenido del array.\r\n"
				+ "4. Salir");
	}
	
	
	public static Triangulo creaTriangulo() {
		Triangulo tr;
		double lado1;
		double lado2;
		double lado3;
		// pedimos lados
		System.out.println("Dime lado 1 del tirámgulo ");
		lado1 = sc.nextDouble();
		System.out.println("Dime lado 2 del tirámgulo ");
		lado2 = sc.nextDouble();
		System.out.println("Dime lado 3 del tirámgulo ");
		lado3 = sc.nextDouble();
		
		tr = new Triangulo(lado1, lado2, lado3);
		
		anadirArray(tr);
		
		return tr;
	}
	
	public static Rectangulo creaRectangulo() {
		Rectangulo rc;
		double lado1;
		double lado2;

		// pedimos lados
		System.out.println("Dime lado 1 del tirámgulo ");
		lado1 = sc.nextDouble();
		System.out.println("Dime lado 2 del tirámgulo ");
		lado2 = sc.nextDouble();

		
		rc = new Rectangulo(lado1, lado2);
		anadirArray(rc);
		
		return rc;
	}
	
	public static void anadirArray(Poligono poligono) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < figuras.length && !encontrado) {
			if (figuras[i] == null) {
				figuras[i] = poligono;
				encontrado = true;
			}
			
			i++;
		}
	}
	
	public static void imprimeArray() {
		double area = 0;
		for(Poligono pl : figuras) {
			if (pl != null) {
				System.out.println(pl);
				area = pl.area();
				System.out.println("Area: " + area);
			}
		}// for
	}

}
