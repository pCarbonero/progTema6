package interfaces.ejercicio03;

public abstract class AnimalDomestico implements Animal, Comparable<AnimalDomestico>{
	
	private String nombre;
	private String raza;
	private int peso;
	private String color;
	
	
	public void vacunar() {
		System.out.println("Vacunado :D");
	}
	
	public abstract boolean hacerCaso();
	
	@Override
	public void comer() {
		this.peso+=1;
	}

	@Override
	public void dormir() {
		System.out.println("zZZZz");
	}

	@Override
	public abstract void hacerRuido();
	
	@Override
	public int compareTo(AnimalDomestico a) {
		return this.peso - a.peso;
	}
}
