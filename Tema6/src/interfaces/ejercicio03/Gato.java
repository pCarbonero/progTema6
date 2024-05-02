package interfaces.ejercicio03;

public class Gato extends AnimalDomestico{
	@Override
	public void hacerRuido() {
		System.out.println("MIAU MIAU");
	}
	
	@Override
	public boolean hacerCaso() {
		boolean siHace = false;
		int a = (int) (Math.random() * 100);
		if (a <= 10) {
			siHace = true;
		}
		return siHace;
	}
}
