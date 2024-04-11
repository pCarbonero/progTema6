package abstractas.ejercicio01;
/**
 * @author pcarbonero
 * Clase que contiene los atributos y metodos para el rectangulo
 */
public class Rectangulo extends Poligono{
	/**
	 * Atributo para la longitud del primer lado
	 */
	private double lado1;
	
	/**
	 * Atributo para la longitud del segundo lado
	 */
	private double lado2;

	
	/**
	 * Constructor con parametros 
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(double lado1, double lado2) {
		super(2);		
		if (lado1 > 0) {
			this.lado1 = lado1;
		}		
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}// fin cop
	
	/**
	 * Constructor sin aprametros
	 */
	public Rectangulo() {
		
	}

	// GETTERS Y SETTERS
	
	public double getLado1() {
		return this.lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	// metodos

	@Override
	public double area() {
		return lado1*lado2;
	}
	
	@Override
	public String toString() {
		String cadena = "Tipo: Rectángulo\n";
		cadena += super.toString();
		return cadena;
	}
} // clase
