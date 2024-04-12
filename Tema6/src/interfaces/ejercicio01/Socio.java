package interfaces.ejercicio01;

public class Socio implements Comparable<Socio> {
	/**
	 * Atributo para el id del socio
	 */
	private int id;
	/**
	 * Atributo para el nombre del socio
	 */
	private String nombre;
	/**
	 * Atributo para la edad del socio
	 */
	private int edad;

	/**
	 * Constructor con todos parametros de la clase
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}// fin constructor

	/**
	 * Sobreescritura del método toString
	 * 
	 * @return cadena
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena += "================\n";
		cadena += nombre + "\n";
		cadena += "ID: " + id + "\n";
		cadena += "Edad: " + edad + "\n";
		cadena += "================\n";
		return cadena;
	}

	public int compareTo(Socio nId) {
		return this.id - nId.id;
	}
}
