package ejercicio;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numerosAleatorios [] = new int [30];
		
		for (int i=1; i<numerosAleatorios.length; i++) {
			numerosAleatorios[i]= (int) (Math.random()*10);
		}
		
		Arrays.sort(numerosAleatorios);
		
		System.out.println(Arrays.toString(numerosAleatorios));
		
	}

}
