package abstractas.ejercicio01;

public class Triangulo extends Poligono{
	/**
	 * Atributo para la longitud del primer lado
	 */
	private double lado1;
	
	/**
	 * Atributo para la longitud del segundo lado
	 */
	private double lado2;
	/**
	 * Atributo para la longitud del tercer lado
	 */
	private double lado3;

	
	/**
	 * Constructor con parametros 
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);		
		if (lado1 > 0) {
			this.lado1 = lado1;
		}		
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}// fin cop
	
	/**
	 * Constructor sin aprametros
	 */
	public Triangulo() {
		
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
		double s = (lado1 + lado2 + lado3) / 2;
		double area = (Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)));;
		return area;
	}
	
	@Override
	public String toString() {
		String cadena = "Tipo: Triángulo\n";
		cadena += super.toString();
		return cadena;
	}
}// clase
