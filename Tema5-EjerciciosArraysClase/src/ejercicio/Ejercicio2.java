package ejercicio;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo un array de nombre tabla y le doy longitud igual a 55 (sumatorio de 10)
		int tabla[] = new int[55];
		
		int inicio = 0;//Declaro variable en la que guardare el elemento inicial en el que hacer fill con Arrays.fill 
		//Y la inicializo a 0 tanto para poder usarla dentro del bucle como para poder hacer fill del primer elemento de la tabla apropiadamente
		
		int fin = 0;//Declaro variable en la que guardare el elemento final en el que hacer fill con Arrays.fill
		//Y la inicializo a 0 para poder hacer fill del primer elemento de la tabla apropiadamente
		
		//Creo bucle para recorrer valores del 1 al 10
		for(int i=1; i<=10; i++) {
			
			//Doy a fin valor igual a inicio + i
			fin = inicio +i;
			
			//Uso la funcion fill perteneciente a la clase Arrays para dar valor a un rango de elementos de la tabla 
			//(tabla, , , ) indica el array o tabla al que se aplica 
			//( , inicio, , ) indica el primer elemento desde el que se aplica
			//( , , final, ) indica el ultimo elemento al que se aplica
			//( , , , i) indica el valor que se aplica a los elementos
			Arrays.fill(tabla, inicio, fin, i);
			
			//Doy a inicio valor igual a fin
			inicio = fin;
		}
		
		//Uso la funcion toString perteneciente a la clase Arrays para recorrer todos los elementos de la tabla indicada (tabla)
		//mostrandolos en un print
		System.out.println(Arrays.toString(tabla));

	
	}

}
