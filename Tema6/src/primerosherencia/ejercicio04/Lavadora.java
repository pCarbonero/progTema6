package primerosherencia.ejercicio04;

public class Lavadora extends Electrodomestico{
	
	double carga = 5;
	
	public Lavadora() {
		
	}
	
	public Lavadora(double precioBase, double peso){
		super(precioBase, peso);
	}
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}
	
	// getter
	public double getCarga() {
		return this.carga;
	}
	
	// metodos
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			this.precioBase = this.precioBase + 50;
		}
	}

}
