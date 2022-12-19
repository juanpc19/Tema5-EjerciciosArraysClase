package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Declaro variable donde guardare el valor de la cuenta del contador
		int contador = 0;

		// array del participante
		int primitivaParticipante[] = new int[6];

		// array del sorteo
		int primitivaSorteo[] = new int[6];

		//Creo un escaner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		//bucle para dar valor random entre 1 y 49 a array primitivaParticipante
		for (int i = 0; i <= primitivaParticipante.length - 1; i++) {

			//Creacion de variable que contiene el valor del numero random creado para la iteracion
			int numeroRandom = (int) (Math.random()*50);

			//Establezco la condicion si numeroRandom igual a 0 
			if (numeroRandom == 0) {
				//que de cumplirse hara un continue repitiendo la iteracion del bucle con otro numeroRandom
				continue;

			} else {
				//De no cumplirse la condicion anterior doy a la posicion i del array el valor de numeroRandom
				primitivaParticipante[i] = numeroRandom;
			}
		}

		
		//bucle para dar valor random entre 1 y 49 a array primitivaSorteo
		for (int i = 0; i <= primitivaSorteo.length - 1; i++) {

			int numeroRandom = (int) (Math.random()*50);

			if (numeroRandom == 0) {
				continue;

			} else {
				primitivaSorteo[i] = numeroRandom;
			}
		}

		// para testeo
		// System.out.println(Arrays.toString(primitivaSorteo));

		Arrays.sort(primitivaSorteo);

		// para testeo
		// System.out.println(Arrays.toString(primitivaSorteo));

		/*prueba busqueda binaria
		 * for (int posicion : primitivaParticipante) {
		 * 
		 * Arrays.binarySearch(primitivaSorteo, primitivaSorteo [0],
		 * primitivaSorteo.length-1, posicion);
		 * 
		 * // Arrays.binarySearch(primitivaSorteo, posicion); }
		 */

		for (int i = 0; i < primitivaSorteo.length - 1; ++i) {
			if (primitivaSorteo[i] == primitivaParticipante[i]) {
				contador++;
			}
		}

		System.out.println(contador);

		dogma.close();
	}

}
