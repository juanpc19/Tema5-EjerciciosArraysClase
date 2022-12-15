package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		//Creo array de nombre puntuaciones con longitud igual a 8
		int puntuaciones [] = new int [8];
		
		int numeroIntroducido;//Declaro variable donde guardare el numero introducido por el usuario
		
		//Creo escaner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner (System.in);
		
		//Bucle para guardar el valor de numeroIntroducido en la posicion correspondiente del array
		for (int i=0; i<puntuaciones.length; i++) {
			
			//Solicito al usuario valor para numeroIntroducido
			 System.out.println("Introduzca puntuacion del jugador: ");
			  
			 //Doy valor a variable numeroIntroducido mediante uso del escaner
			 numeroIntroducido=dogma.nextInt();	
			 
			 //Establezco de condicion que numeroIntroducido sea menor a 1000 o mayor a 2800
			 if (numeroIntroducido<1000 || numeroIntroducido>2800) {
				 //De cumplirse la condicion imprimira mensaje de error por pantalla
				 System.out.println("Error, valor no valido para una puntuacion, introduzca un valor entre 1000 y 2800");
				 //Si no cumple condicion resto 1 a i para que la posicion del array a la que asigno 
				 //el valor de numeroIntroducido sea la misma hasta que el usuario introduzca un valor valido
				 i--;
				 } else {
					 //De no cumplirse la condicion anterior asigno valor de numeroIntroducido a la posicion del array determinada por i
					 puntuaciones [i]=numeroIntroducido;
				 }
			}
		
		//Uso Arrays.sort para ordenar de menor a mayor los elementos de la tabla
		Arrays.sort(puntuaciones );
		
		//Bucle para recorrer el array recorriendo los elementos de mayor a menor 
		for (int i=puntuaciones.length-1; i>=0; i--) {
			
		//Hago print del valor de la posicion actual
		  System.out.println(puntuaciones [i]);
		}
		
		//Cierro escaner
		dogma.close();
		
	}

}
