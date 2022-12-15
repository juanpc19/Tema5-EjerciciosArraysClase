package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int puntuaciones [] = new int [8];
		
		int numeroIntroducido;
		
		Scanner dogma= new Scanner (System.in);
		
		//Bucle para guardar el valor de numeroIntroducido en la posicion correspondiente del array
		for (int i=0; i<puntuaciones.length; i++) {
			
			 System.out.println("Introduzca puntuacion del jugador: ");
			  
			 numeroIntroducido=dogma.nextInt();	
			 
			 if (numeroIntroducido<1000 || numeroIntroducido>2800) {
				 System.out.println("Error, valor no valido para una puntuacion, introduzca un valor entre 1000 y 2800");
				 //Si no cumple condicion resto 1 a i para que la posicion del array a la que asigno 
				 //el valor de numeroIntroducido sea la misma hasta que el usuario introduzca un valor valido
				 i--;
				 } else {
					 
					 puntuaciones [i]=numeroIntroducido;
				 }
			}
		
		//Uso Arrays.sort para ordenar de menor a mayor los elementos de la tabla
		Arrays.sort(puntuaciones );
		
		//Bucle para recorrer el array recorriendo los elementos de mayor a menor 
		for (int i=puntuaciones .length-1; i>=0; i--) {
			
		//Hago print del valor de la posicion actual
		  System.out.println(puntuaciones [i]);
		}
		
		//Cierro escaner
		dogma.close();
		
	}

}
