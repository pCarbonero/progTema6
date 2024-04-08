package primerosherencia.ejercicio04;

/**
 * Clase que almacena los atributos y metodos que tendrán todos los
 * electrodomesticos
 * 
 * @author pcarbonero
 */
public class Electrodomestico {
	protected double precioBase = 100;

	protected enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	protected enum posiblesComsumoEnergetico {
		A, B, C, D, E, F
	}

	protected double peso = 5;

	protected colores color = colores.BLANCO;
	protected posiblesComsumoEnergetico consumoEnergetico = posiblesComsumoEnergetico.F;

	// CONSTRUCTORES
	/**
	 * Constructor sin paraetros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con parametros para dos atributos de la clase
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con parámetros todos los atributos de la clase
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		comprobarColor(color);

		comprobarConsumoEnergetico(consumoEnergetico);

		if (peso > 0) {
			this.peso = peso;
		}

	}// constructor

	// GET DE LOS ATRIBUTOS
	public double getPrecioBase() {
		return this.precioBase;
	}

	public double getPeso() {
		return this.peso;
	}

	public colores getColor() {
		return this.color;
	}

	public posiblesComsumoEnergetico getConsumoEnergetico() {
		return this.consumoEnergetico;
	}

	// METODOS

	private void comprobarConsumoEnergetico(char letra) {

		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.consumoEnergetico = posiblesComsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		default:
			this.consumoEnergetico = posiblesComsumoEnergetico.F;
			break;
		}

	}// fin metodo

	private void comprobarColor(String color) {

		String colorMayus = color.toUpperCase();

		switch (colorMayus) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			this.color = colores.valueOf(colorMayus);
			break;
		default:
			this.color = colores.BLANCO;
			break;
		}

	}

	public void precioFinal() {
		if (this.peso > 0 && this.peso < 19) {
			this.precioBase = this.precioBase + 10;
		}
		if (this.peso > 20 && this.peso < 99) {
			this.precioBase = this.precioBase + 50;
		}
		if (this.peso > 50 && this.peso < 79) {
			this.precioBase = this.precioBase + 80;
		}
		if (this.peso > 80) {
			this.precioBase = this.precioBase + 100;
		}

		switch (consumoEnergetico) {
		case A: {
			this.precioBase = this.precioBase + 100;
			break;
		}
		case B: {
			this.precioBase = this.precioBase + 80;
			break;
		}
		case C: {
			this.precioBase = this.precioBase + 60;
			break;
		}
		case D: {
			this.precioBase = this.precioBase + 50;
			break;
		}
		case E: {
			this.precioBase = this.precioBase + 30;
			break;
		}
		case F: {
			this.precioBase = this.precioBase + 10;
			break;
		}
		}
	}

}// fin clase
