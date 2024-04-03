package primerosherencia.ejercicio02;

public class Empleado {
	private String nombre;
	/**
	 * Constructor
	 * @param nombre
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	// GET Y SET
	

	public void setNombre(String nombre) {
		if (nombre != null && nombre.equals("")) {
			this.nombre = nombre;
		}
	}//
	
	public String getNombre() {
		return this.nombre;
	}
	
	// TO STRING
	@Override
	public String toString() {
		String cadena = "";
		cadena += "Empleado " + this.nombre;
		return cadena;
	}
}
