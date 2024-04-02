package primerosherencia.ejercicio01;
/**
 * @author pcarbonero
 */
public class Hora {
	/**
	 * Atributo que almacena la hora
	 */
	protected int hora;
	/**
	 * Atributo que almacena los minutos
	 */
	protected int minuto;
	
	
	// COSNTRUCTOR
	/**
	 * Constructor de la clase con parametros para las hora y los minutos
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}	
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}// constructor
	
	// SETTERS
	/**
	 * 
	 * @param hora
	 * @return
	 */
	boolean setHora(int hora) {
		boolean esPosible = false;
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			esPosible = true;
		}	
		return esPosible;
	}
	/**
	 * 
	 * @param minuto
	 * @return
	 */
	boolean setMinutos(int minuto) {
		boolean esPosible = false;
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			esPosible = true;
		}	
		return esPosible;
	}
	
	
	// METODOS
	void inc() {
		this.minuto++;
		if (this.minuto == 60) {
			this.minuto = 0;
			this.hora++;
		}
		
		if (this.hora == 24) {
			this.hora = 0;
		}
	}
	
	// TO STRING
	/**
	 * 
	 * @return cadena
	 */
	public String toString() {
		String cadena = "";
		// hora
		if (this.hora<10) {
			cadena += "0" + this.hora + ":";
		}
		else {
			cadena += this.hora + ":";
		}
		// minutos
		if (this.minuto < 10) {
			cadena += "0" + this.minuto;
		}
		else {
			cadena += this.minuto;
		}
		//
		return cadena;
	}
}
