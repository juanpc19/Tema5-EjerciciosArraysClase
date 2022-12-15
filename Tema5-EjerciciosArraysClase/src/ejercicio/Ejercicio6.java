package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numero;//Declaro variable que guardara el valor del numero introducido por el usuario
		
		int contador=0;//Declaro variable que guardara el valor del contador
		
		boolean existe=false;//Declaro variable que guardara respuesta de si el numero existe en el array o no
		
		//Creo array lo llamo mil y le doy longitud igual a 1000
		int mil [] = new int [1000];
		
		//Creo escaner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		//Bucle para rellenar el array con numeros random entre 0 y 100
		for (int i=0; i<=mil.length-1; i++) {
			mil[i]= (int) (Math.random()*100);
		}
		//Print para comprobar el array innecesario pero util en desarrollo
		System.out.println(Arrays.toString(mil));
		
		//Solicito un numero al usuario
		System.out.println("Introduzca un numero entero para comprobar si existe en el array: ");
		
		//Doy valor a variable numero con escaner
		numero=dogma.nextInt();
		
		//Bucle para aumentar valor de i recorriendo el array en toda su longitud
		//Donde i sera mi indice de busqueda que comprobara las posiciones del array
		for (int i=0; i<mil.length; i++) {
		
			//Si el numero introducido es igual a el valor de la posicion dada por i
			if (numero==mil[i]) {
				//Sumo uno al contador
				contador++;
				//Y existe toma valor true
				existe=true;
			}
		}
		//Hago print dependiente de la evaluacion de operador ternario de la variable existe
		System.out.println(existe ? "El numero se encuentra en el array " + contador + " de veces." : "El numero no se encuentra en el array.");
		
		//Cierro escaner
		dogma.close();
	}

}
