/**
 * 
 */
package modelo;

/**
 * @author Carlos Massavanhane
 *
 */
public class Recursividade {
	
	/**
	 * Metodo para calcular potencia de um numero
	 * @param b - base 
	 * @param e - expoente
	 * @return valor da potencia
	 */
	public static int calcularPotencia(int b, int e) {
		
		if(e==0)
			return 1;
		else 
			return b* calcularPotencia(b,e-1);
	}
}
