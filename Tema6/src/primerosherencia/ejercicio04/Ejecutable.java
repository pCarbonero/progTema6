package primerosherencia.ejercicio04;

public class Ejecutable {
	public static void main(String[] args) {
		Electrodomestico[] listaE = new Electrodomestico[10];
		double sumaPrecios = 0;
		Lavadora lv = new Lavadora(100, "BLANCO", 'B', 20, 10);
		Television tv = new Television(2000, "NEGRO", 'E', 8, 20, false);
		
		listaE[0] = lv;
		listaE[1] = tv;
		
	    for (Electrodomestico item : listaE) {
	        if (item != null) {
	            item.precioFinal();
	            System.out.println("Precio final del electrodomestico: " + item.getPrecioBase());
	        }
	    }
	    
		for(Electrodomestico item : listaE) {
			if (item != null) {
				sumaPrecios += item.getPrecioBase();
			}		
		}
		System.out.println("SUMA PRECIOS " + sumaPrecios);
	}// main

}
