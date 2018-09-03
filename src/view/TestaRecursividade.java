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
		//testando metodo factorial recursivo(exercicio1)
		System.out.println(Recursividade.calcularFactorial(8));
		//Testando metodo somar recursivo(exercicio2)
		Vector<Integer> vector=new Vector<>();
		vector.add(new Integer(1));
		vector.add(new Integer(2));
		vector.add(new Integer(3));
		vector.add(new Integer(4));
		System.out.println(Recursividade.somaElementos(vector, 4));
		//System.out.println(Recursividade.somarValores(vector));
		
		/*Testando metodo multipolicar recursivo(exercicio4)*/
		System.out.println(Recursividade.multiplicar(4, 3));
		
		/*Testando metodo inverter numero (exercicio2)*/
		System.out.println(Recursividade.inverterNumero(12345));
		
		/*Testando metodo converter binario(exercicio5)*/
		System.out.println(Recursividade.converterParaBinario(9));
		
		/*Testando metodo para somarDigitos de um algoritmo(Exercicio 6)*/
		System.out.println(Recursividade.somarDigitosNumero(1089));
		
		/*Testando quantidade de aparicoes de algarismo(exercicio7)*/
		System.out.println(Recursividade.verificarAparicoes(3452555, 5, 0));
	}

}
