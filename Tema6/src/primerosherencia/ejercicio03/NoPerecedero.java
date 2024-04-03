package primerosherencia.ejercicio03;

public class NoPerecedero extends Producto{

	private String tipo;
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}
	
	//METODOS
	@Override
	public double calcular(int cantidad) {
		double total = super.calcular(cantidad);
		return total;
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += "; Tipo: " + this.tipo;
		return cadena;
	}

}
