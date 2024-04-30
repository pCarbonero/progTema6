package analisis.ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> listaContactos = new ArrayList<>();
	
	// metodos
	public boolean addContacto(Contacto c) {
		boolean added = false;
		
		if (c != null && !listaContactos.contains(c)) {
			listaContactos.add(c);
			added = true;
		}
		return added;
	}// 
	
	
	public void mostrarLista() {
		for (Contacto c : listaContactos) {
			System.out.println(c);
		}
	}
}
