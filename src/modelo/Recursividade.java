/**
 * 
 */
package modelo;

import java.util.Vector;

/**
 * @author Carlos Massavanhane
 *
 */
public class Recursividade {
	
	/**
	 * Metodo para calcular potencia de um numero dado
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
	
	/**
	 * Metodo para calcular factorial de um numero dado
	 * @param n
	 * @return
	 */
	public static int calcularFactorial(int n) {
		if(n==0)
			return 1;
		else
			return n * calcularFactorial(n-1);
	}
	
	/**
	 * Metodo para somar elementos de um vector de inteiros
	 * @param vecto - Vector
	 * @param nElem - numero de elementos
	 */
	public static int somaElementos(Vector<Integer> vector, int nElem ) {
		if(nElem==0)
			return 0;
		else
			return vector.get(--nElem).intValue()+somaElementos(vector, nElem--);
	}
	
	public static int multiplicar(int a, int b) {
		if(b==0)
			return 0;
		else
			return a+Recursividade.multiplicar(a, --b);	}
	
}
