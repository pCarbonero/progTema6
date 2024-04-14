package interfaces.ejercicio02;

public class Futbolista implements Comparable<Futbolista>{
	
	/**
	 * 
	 */
	private int numCamiseta;
	/*
	 * 
	 */
	private String nombre;
	/**
	 * 
	 */
	private int edad;
	/**
	 * 
	 */
	private int numGoles;
	
	
	/**
	 * Constructoir con parametros
	 * @param numCamiseta
	 * @param nombre
	 * @param edad
	 * @param numGoles
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		
		if (nombre!= null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if (edad > 0) {
			this.edad = edad;
		}
		
		if (numGoles > 0) {
			this.numGoles = numGoles;
		}
	}// cs
	

	/**
	 * override del metodo toString
	 * @return Cadena con la información de todos los atributos de la clase
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Nombre; " + this.nombre + "\n";
		cadena += "Dorsal: " + this.numCamiseta + "\n";
		cadena += "Edad: " + this.edad + "\n";
		cadena += "Goles: " + this.numGoles + "\n";
		
		return cadena;
	}
	
	/**
	 * Override de e lmetodo equals
	 * @return true si tienen el mismo numbre y numero
	 */
	@Override
	public boolean equals(Object o) {
		boolean isEqual = false;
		
		Futbolista ft = (Futbolista) o;
		
		if (this.nombre.equals(ft.nombre) && this.numCamiseta == ft.numCamiseta) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	/**
	 * Override del metodo compareTo
	 */
	@Override
	public int compareTo(Futbolista o) {
		int diff = 0;
		
		if (this.numCamiseta != o.numCamiseta) {
			if (this.numCamiseta > o.numCamiseta) {
				diff = 1;
			}
			else if (this.numCamiseta < o.numCamiseta) {
				diff = -1;
			}
		}
		else {
			if (this.nombre.compareTo(o.nombre) > 0) {
				diff = 1;
			}
			else if (this.nombre.compareTo(o.nombre) < 0) {
				diff = -1;
			}
			else {
				diff = 0;
			}
		}
		return diff;
	}

}
