package analisis.ejercicio04;

public class Contacto {
	private String nombre;
	private int tlfn;
	
	// constructor
	public Contacto(String nombre, int tlfn) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (tlfn <= 699999999 && tlfn >=600000000) {
			this.tlfn = tlfn;
		}
	}// constructor

	
	// getters y setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTlfn() {
		return this.tlfn;
	}

	public void setTlfn(int tlfn) {
		this.tlfn = tlfn;
	}
	
	/////////////
	//EQUALS
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		Contacto c = (Contacto) obj;
		if (this.nombre.equals(c.nombre)) {
			isEqual = true;
		}
		return isEqual;
	}
	
	@Override
	public String toString() {
	    return "Nombre: " + this.nombre + ", Teléfono: " + this.tlfn;
	}
	
	
}// clase
