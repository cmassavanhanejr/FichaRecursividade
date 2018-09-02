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
	
	/**
	 * Metodo para multiplicar
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiplicar(int a, int b) {
		if(b==0)
			return 0;
		else
			return a+Recursividade.multiplicar(a, --b);	}
	
	public static int somarValores(Vector<Integer> vetor) {
        if (vetor.isEmpty()) {
            return 0;
        }
        int soma = vetor.firstElement();
        vetor.remove(vetor.firstElement());
        return soma += somarValores(vetor);
    }

	public static int converterParaBinario(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        //int restoDaDivisao = (i - ((i / 2) * 2));	
			return	Integer.parseInt(converterParaBinario(n / 2) + "" + (n - ((n / 2) * 2)));   
	    }
	
	/**
	 * Metodo para inverter numero
	 * @param i
	 * @return
	 */
	public static int inverterNumero(int n) {
        String numero = n+"";
        if (numero.length() == 1) {
            return n;
        }
        return Integer.parseInt(Integer.parseInt(numero.substring(numero.length() - 1)) + "" + inverterNumero(Integer.parseInt(numero.substring(0, numero.length() - 1))));
    }

	/**
	 * Metodo recursivo que soma todos os algarismos de um número
	 * @param n
	 * @return
	 */
	public static int somarDigitosNumero(int num) {
		if(num==0) {
			return num;
		}
		return (num%10) + somarDigitosNumero(num/10);
	}

	
	/*Inverter sem usar calsse string*/
	public static int inverter(int fonte) { return inverter( fonte / 10, fonte % 10 ); }
	
	public static int inverter(int fonte, int destino ) { 
		  //1. se fonte for 0, retorna o destino
			if(fonte==0) {
				return destino;
			}
		  //2. pega o digito e o resto da fonte
			int digito=fonte/10;
			int resto=fonte%10;
		  //3. multiplica o destino por 10 e soma com o digito
			destino=destino*10+digito;
		  //4. chama a funcao de novo porem chame como funcao(resto, destino)
			return inverter(resto,destino);
	} 

}
