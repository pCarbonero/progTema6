package interfaces.ejercicio03;

public class Perro extends AnimalDomestico{
	@Override
	public void hacerRuido() {
		System.out.println("GUAU GUAU");
	}
	
	@Override
	public boolean hacerCaso() {
		boolean siHace = false;
		int a = (int) (Math.random() * 100);
		if (a <= 90) {
			siHace = true;
		}
		return siHace;
	}
}
