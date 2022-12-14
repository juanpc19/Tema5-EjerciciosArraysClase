package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n; //Declaro variable en la que guardare la longitud de la array
		
		int m; //Declaro variable en la que guardare el valor que deseo dar a los elementos del array 

		//Creo escaner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario valor para n
		System.out.println("Introduzca un valor para N que sera la longitud de la tabla: ");
		
		//Doy valor a n con escaner
		n=dogma.nextInt();
		
		//Solicito al usuario valor para m
		System.out.println("Introduzca un valor para M que sera el valor dado a todos los elementos de la tabla: ");
		
		//Doy valor a m con escaner
		m=dogma.nextInt();
		
		//Creo array de nombre tipoM y le doy longitud igual a n
		int tipoM [] = new int [n];
		
		//Uso la funcion fill perteneciente a la clase Arrays para dar el mismo valor a todos los elementos de la tabla 
		//(tipoM,m) indica el array o tabla al que se aplica y m el valor que se aplica al elemento
		Arrays.fill(tipoM, m);
		
		//Uso la funcion toString perteneciente a la clase Arrays para recorrer todos los elementos de la tabla indicada (tipoM)
		//mostrandolos en un print
		System.out.println(Arrays.toString(tipoM));
		
		//Cierro Scanner
		dogma.close();

	}

}
