package ejercicio;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		//Creo array de nombre numerosAleatorios con longitud igual a 30
		int numerosAleatorios [] = new int [30];
		
		//Creo bucle que recorrera todas las posiciones del array usando variable i
		for (int i=1; i<numerosAleatorios.length; i++) {
			//Le doy a cada posicion un valor igual a un numero aleatorio del 0 al 10
			numerosAleatorios[i]= (int) (Math.random()*10);
		}
		
		//Uso la funcion sort dentro de la clase Arrays para ordenar los elementos del array de menor a mayor
		Arrays.sort(numerosAleatorios);
		
		//Hago print del array haciendo uso de la funcion toString dentro de la clase Arrays
		System.out.println(Arrays.toString(numerosAleatorios));
		
	}

}
