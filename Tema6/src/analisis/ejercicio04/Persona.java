package analisis.ejercicio04;

public class Persona extends Contacto{

	private String cumple;
	
	public Persona(String nombre, int tlfn, String cumple) {
		super(nombre, tlfn);
		
		if (cumple != null && !cumple.equals("")) {
			this.cumple = cumple;
		}
	}

	public String getCumple() {
		return cumple;
	}

	public void setCumple(String cumple) {
		this.cumple = cumple;
	}
	
	@Override
	public String toString() {
		String a = super.toString();
		a += "Cumple: " + this.cumple;
	    return a;
	}

}
