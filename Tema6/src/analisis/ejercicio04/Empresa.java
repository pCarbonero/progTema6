package analisis.ejercicio04;

public class Empresa extends Contacto{

	private String web;
	
	public Empresa(String nombre, int tlfn, String web) {
		super(nombre, tlfn);
		
		if (web != null && !web.equals("")) {
			this.web = web;
		}
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	@Override
	public String toString() {
		String a = super.toString();
		a += "WEB: " + this.web;
	    return a;
	}

}
