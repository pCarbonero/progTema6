package analisis.ejercicio04;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
		int opc = 0;
		Agenda a = new Agenda();
		Contacto cn;

		do {
			System.out.println("OPCION");
			opc = sc.nextInt();
			sc.nextLine();
		switch (opc) {
		case 1: {
			cn = crearContacto();
			a.addContacto(cn);
			break;
		}
		case 2:{
			a.mostrarLista();
			break;
		}
		default:
			System.out.println("Opción no válida");
		}
			
		} while (opc != 5);

	}

	public static void menu() {
		System.out.println("AGENDA DE CONTACTOS");
		System.out.println("1. AÑADIR CONTACTO");
		System.out.println("2. VER LISTA");
	}
	
	public static Contacto crearContacto() {
		Contacto c = null;
		String nombre;
		int tlfn;
		String opc2;
		
		System.out.println("NOMBRE?");
		nombre = sc.nextLine();
		
		System.out.println("TELEFONO?");
		tlfn = sc.nextInt();
		sc.nextLine();
		
		////////////
		System.out.println("Es EMPRESA?--- S/N");
		opc2 = sc.nextLine();
		switch (opc2) {
		case "S": {
			c = contactoEmpresa(nombre, tlfn);
			break;
		}
		case "N":{
			c = contactoPersona(nombre, tlfn);
			break;
		}

		}
		return c;
	}
	
	public static Empresa contactoEmpresa(String nombre, int tlfn) {
		Empresa e;
		String web;
		
		System.out.println("WEB?");
		web = sc.nextLine();
		
		e = new Empresa(nombre, tlfn, web);
		
		return e;
	}
	
	public static Persona contactoPersona(String nombre, int tlfn) {
		Persona p;
		String cumple;
		
		System.out.println("CUMPLE?");
		cumple = sc.nextLine();
		
		p = new Persona(nombre, tlfn, cumple);
		
		return p;
	}

}
