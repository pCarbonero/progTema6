package primerosherencia.ejercicio01;

public class Main {

	public static void main(String[] args) {
		// 
		int hora = 23;
		int minuto = 59;
		int segundo = 59;
		
		HoraExacta hr = new HoraExacta(hora, minuto, segundo);
		
		System.out.println(hr.toString());
		
		hr.inc();
		
		System.out.println(hr.toString());

	}

}
