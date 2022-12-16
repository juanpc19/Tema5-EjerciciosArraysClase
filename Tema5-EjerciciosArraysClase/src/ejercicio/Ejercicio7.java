package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int primitivaParticipante[] = new int [6];
		
		int primitivaSorteo[] = new int [6];
		
		Scanner dogma = new Scanner(System.in);
		
		for (int i=0; i<=primitivaParticipante.length-1; i++) {
				
			int numeroRandom=(int) (Math.random()*49);
				
			if (numeroRandom==0) {
				continue;
				
			} else {
				primitivaParticipante[i]=numeroRandom;
			}
		}
		
		System.out.println(Arrays.toString(primitivaParticipante));
		
		for (int i=0; i<=primitivaSorteo.length-1; i++) {
			
			int numeroRandom=(int) (Math.random()*49);
				
			if (numeroRandom==0) {
				continue;
				
			} else {
				primitivaSorteo[i]=numeroRandom;
			}
		}
		
		System.out.println(Arrays.toString(primitivaSorteo));
		
		Arrays.sort(primitivaSorteo);
		
		System.out.println(Arrays.toString(primitivaSorteo));
		
		for (int posicion : primitivaParticipante) {
			
			Arrays.binarySearch(primitivaSorteo, primitivaSorteo[0], primitivaSorteo.length-1,  posicion);		
		
		}
		
		dogma.close();
	}

}
