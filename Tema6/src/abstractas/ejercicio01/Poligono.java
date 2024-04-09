package abstractas.ejercicio01;

public abstract class Poligono {
	protected int numeroLados;
	
	/**
	 * Constructor de la clase
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}// co
	public Poligono() {
		
	}
	
	// GET
	/**
	 * Metodo get para obtener el numro de lados del poligono
	 * @return
	 */
	public int getNumeroLados() {
		return this.numeroLados;
	}
	
	@Override
	public String toString(){
		String cadena = "";
		cadena += "Nº lados: " + this.numeroLados;
		return cadena;
	}// 
	
	public abstract double area();	
}
