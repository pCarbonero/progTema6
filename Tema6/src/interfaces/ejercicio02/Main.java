package interfaces.ejercicio02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista fut1 = new Futbolista(15, "Youseff En-Nesyri", 25, 15);
		Futbolista fut2 = new Futbolista(20, "Isaac Romero", 23, 5);
		Futbolista fut3 = new Futbolista(26, "Juanlu Sánchez", 20, 2);
		Futbolista fut4 = new Futbolista(1, "Dmtrovic", 30, 0);
		
		Futbolista[] futLista = {fut3, fut1, fut4, fut2};
		
		for (Futbolista ft : futLista) {
			System.out.println("========");
			System.out.print(ft);
		}
		
		Arrays.sort(futLista);
		System.out.println("=!=!=!=!=!=!=!!=!=!=!=!!=");
		
		for (Futbolista ft : futLista) {
			System.out.println("========");
			System.out.print(ft);
		}

	}

}
