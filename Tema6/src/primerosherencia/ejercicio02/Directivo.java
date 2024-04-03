package primerosherencia.ejercicio02;

public class Directivo extends Empleado{

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += super.toString();
		cadena += " -> Directivo";
		return cadena;
	}
}
