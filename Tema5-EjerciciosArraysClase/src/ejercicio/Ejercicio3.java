package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		//Creo array de nombre tablaOrigen en el que guardare los 20 valores introducidos por el usuario y le doy longitud igual a 20
		int tablaOrigen [] = new int [20];
		
		//Creo array de nombre tabla1 en el que guardare los 10 primeros valores introducidos por el usuario y le doy longitud igual a 10
		int tabla1 [] = new int [10];
		
		//Creo array de nombre tabla2 en el que guardare los 10 ultimos valores introducidos por el usuario y le doy longitud igual a 10
		int tabla2 [] = new int [10];
		
		//Creo escaner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Creo bucle para solicitar al usuario valor para los elementos de la tablaOrigen
		for (int i=0; i<tablaOrigen.length; i++) {
			//Solicito valor para el elemento
			System.out.println("Introduzca un numero: ");
			//Lo asigno a elemento de la tablaOrigen determinado por i
			tablaOrigen[i]=dogma.nextInt();
		}
		
		//Doy a los 10 elementos de tabla1 el valor de los 10 primeros elementos de tablaOrigen
		//usando la funcion copyOfRange de la clase Arrays donde:
		//(tablaOrigen, , ) indica la tabla cuyo rango se va a copiar
		//( ,0, ) indica el primer elemento que se va a copiar
		//( , ,10) indica el ultimo elemento que se va a copiar
		tabla1 = Arrays.copyOfRange(tablaOrigen, 0, 10);
		
		//Doy a los 10 elementos de tabla2 el valor de los 10 ultimos elementos de tablaOrigen
		//usando la funcion copyOfRange de la clase Arrays donde:
		//(tablaOrigen, , ) indica la tabla cuyo rango se va a copiar
		//( ,10, ) indica el primer elemento que se va a copiar
		//( , ,20) indica el ultimo elemento que se va a copiar
		tabla2 = Arrays.copyOfRange(tablaOrigen, 10, 20);
		
		//Uso la funcion equals perteneciente a la clase Arrays para comparar los elementos de una tabla a la otra (tabla1, tabla2)
		//Hago print con un operador ternario con resultado de la comparacion
		System.out.println(Arrays.equals(tabla1, tabla2) ? "Los arrays son iguales." : "Los arrays no son iguales.");
		
		//Cierro escaner
		dogma.close();

	}

}
