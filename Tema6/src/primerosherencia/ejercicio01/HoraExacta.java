package primerosherencia.ejercicio01;
/**
 * 
 * @author pcarbonero
 */
public class HoraExacta extends Hora{
	/**
	 * Atributo que almacena los minutos de la hora
	 */
	private int segundos;
	
	//CONSTRUCTOR
	/**
	 * Constructor de la clase EoraExacta
	 * @param hora
	 * @param minuto
	 * @param segundos
	 */
	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}
	
	//SET
	boolean setSegundos(int segundos) {
		boolean esPosible = false;
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
		return esPosible;
	}
	
	//
	void inc() {
		this.segundos++;
		if (this.segundos == 60) {
			this.segundos = 0;
			super.inc();
		}

	}

}
