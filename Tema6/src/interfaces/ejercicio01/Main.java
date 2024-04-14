package interfaces.ejercicio01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio sc1 = new Socio(1111, "Isaac Netero", 120);
		Socio sc2 = new Socio(2222, "Chrollo Lucifer", 24);
		Socio sc3 = new Socio(3333, "Hisoka Morou", 27);
		Socio sc4 = new Socio(4444, "Silva Zoldyck", 44);
		Socio sc5 = new Socio(9999, "Ging Freecs", 41);
		
		Socio[] listaSocios = {sc2, sc4, sc5, sc1, sc3};
		
		for (Socio sc : listaSocios) {
			System.out.println(sc);
		}
		
		Arrays.sort(listaSocios);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		for (Socio sc : listaSocios) {
			System.out.println(sc);
		}
		
		
		String a = "abc";
		String b = "def";
		
		System.out.println(a.compareTo(b));
		
	}

}
