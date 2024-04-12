package interfaces.ejercicio01;

public class Main {

	public static void main(String[] args) {
		Socio[] listaSocios = new Socio[5];
		Socio sc1 = new Socio(1111, "Isaac Netero", 120);
		Socio sc2 = new Socio(2222, "Chrollo Lucifer", 24);
		Socio sc3 = new Socio(3333, "Hisoka Morou", 27);
		Socio sc4 = new Socio(4444, "Silva Zoldyck", 44);
		Socio sc5 = new Socio(2222, "Ging Freecs", 41);
		

		
		System.out.println(sc1);
		System.out.println(sc2);
		
		System.out.println(sc1.compareTo(sc2));
	}

}
