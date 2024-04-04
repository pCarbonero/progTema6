package primerosherencia.ejercicio04;

public class Television extends Electrodomestico{
	
	private double resolucion = 20;
	private boolean sintonizadorTdt = false;
	
	public Television() {
		
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTdt) {
		super(precioBase, color, consumoEnergetico, peso);
		
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		this.sintonizadorTdt = sintonizadorTdt;
	}
	
	// get
	public double getResolucion() {
		return resolucion;
	}


	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}

	
	// metodos
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.resolucion >= 40) {
			this.precioBase = this.precioBase + (this.precioBase*0.3);
		}
		
		if (sintonizadorTdt) {
			this.precioBase = this.precioBase + 50;
		}
	}

}
