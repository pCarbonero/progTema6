package interfaces.ejercicio03;

public abstract class AnimalDomestico implements Animal{
	
	private String nombre;
	private String raza;
	private String peso;
	private String color;
	
	
	public void vacunar() {
		
	}
	
	public boolean hacerCaso() {
		return false;	
	}
	
	@Override
	public void comer() {
		
	}

	@Override
	public void dormir() {
		
	}

	@Override
	public void hacerRuido() {
		
	}

}
