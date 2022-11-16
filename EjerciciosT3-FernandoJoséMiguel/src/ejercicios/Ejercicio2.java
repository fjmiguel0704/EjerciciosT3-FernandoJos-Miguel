package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos la variable numero, que guardará un dato introducido por el teclado
		int numero;
		
		//Esta contará el número de no primos
		int contNoPrimo=0;
		
		//Contará el número de primos
		int contPrimo=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Introduce un número: ");
		numero = read.nextInt();

		//Creamos i y la incrementamos mientras sea menor a numero
		for(int i = 2; i<numero; i++) {
			
			//Creamos j y la incrementos mientras sea menor a i 
			for(int j = 2; j<i; j++) {
				
				//Si i entre j da de resto 0, incrementos el contador de los no primos en 1
				if(i%j==0) {
					contNoPrimo++;
					
					//Salimos del bucle
					break;
				}
			}
		}
		
		//El contador de primo va a ser igual al número menos el contador de no primos, menos 2
		contPrimo=(numero-contNoPrimo)-2;
		
		//Mostramos el contador de primos por pantalla
		System.out.println("Del 2 al " + (numero-1) + " hay " + contPrimo + " números primos");
		
		//Cerramos el Scanner 
        read.close();

	}

}
