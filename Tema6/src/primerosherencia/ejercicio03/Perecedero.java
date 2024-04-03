package primerosherencia.ejercicio03;

public class Perecedero extends Producto{
	
	private int diasACaducar;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}//

	public int getDiasACaducar() {
		return this.diasACaducar;
	}
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}
	
	@Override
	public double calcular(int cantidad) {
		double total = super.calcular(cantidad);
		double totalFinal = total;
		if (diasACaducar == 1) {
			totalFinal = total/4;
		}
		if (diasACaducar == 2) {
			totalFinal = total/3;
		}
		if (diasACaducar == 3) {
			totalFinal = total/2;
		}
		return totalFinal;
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += "; Dias a caducar: " + diasACaducar;
		return cadena;
	}
	
}
