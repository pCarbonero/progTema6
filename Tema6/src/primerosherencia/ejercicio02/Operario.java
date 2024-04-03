package primerosherencia.ejercicio02;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += super.toString();
		cadena += " -> Operario";
		return cadena;
	}
}
