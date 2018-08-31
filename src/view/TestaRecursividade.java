/**
 * 
 */
package view;

import java.util.Vector;

import modelo.Recursividade;

/**
 * Classe responsavel por fazer testess das funcoes da ficha de exercicios 06 sobre recursividades
 * @author Carlos Massavanhane
 * @version 1.0
 *
 */
public class TestaRecursividade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testando metodo potecnia recursivo
		System.out.println(Recursividade.calcularPotencia(10, 3));
		//testando metodo factorial recursivo
		System.out.println(Recursividade.calcularFactorial(8));
		//Testando metodo somar recursivo
		Vector<Integer> vector=new Vector<>();
		vector.add(new Integer(1));
		vector.add(new Integer(2));
		vector.add(new Integer(3));
		vector.add(new Integer(4));
		System.out.println(Recursividade.somaElementos(vector, 4));
		
		/*Testando metodo multipolicar recursivo*/
		System.out.println(Recursividade.multiplicar(4, 3));
	}

}
