package primerosherencia.ejercicio04;
/**
 * Clase que almacena los atributos y metodos que tendrán todos los electrodomesticos
 * @author pcarbonero
 */
public class Electrodomestico {
	protected double precioBase = 100;
	protected enum colores{
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	protected enum posiblesComsumoEnergetico{
		A, B, C, D, E, F
	}
	protected double peso = 5;
	
	protected colores color = colores.BLANCO;
	protected posiblesComsumoEnergetico  consumoEnergetico = posiblesComsumoEnergetico.F;
	
	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, colores color, 
			posiblesComsumoEnergetico  consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		
		if (color != null && !color.equals("")) {
			
		}
		
	}// constructor
	

}// fin clase
