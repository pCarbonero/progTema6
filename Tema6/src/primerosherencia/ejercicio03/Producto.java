package primerosherencia.ejercicio03;

public class Producto {
	protected String nombre;
	protected double precio;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	//GET Y SET
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	// METODOS
	public double calcular(int cantidad) {
		double total = cantidad*this.precio;
		return total;
	}
	
	//tostring
	@Override
	public String toString() {
		String cadena = "";
		cadena += this.nombre + ": " + this.precio + "€";
		return cadena;
	}

}
