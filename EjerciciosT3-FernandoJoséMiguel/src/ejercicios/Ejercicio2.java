package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*Pruebas: 
    	 * -0 ejecuciones: 
    	 * Introduzco 0. Resultado esperado: "0 primos". Resultado obtenido: "0 primos"
    	 * -1 ejecución:
    	 * Introduzco 2. Resultado esperado: "1 primo". Resultado obtenido: "1 primo"
    	 * -Máximas ejecuciones:
    	 * No se puede realizar porque los números son infinitos
    	 * -Valor intermedio de ejecuciones:
    	 * Introduzco 90. Resultado esperado: "24 primos". Resultado obtenido: "24 primos"
    	 */
		
		//Creamos la variable numero, que guardará un dato introducido por el teclado
		int numero;
		
		//Contará el número de primos
		int contPrimo=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Introduce un número: ");
		numero = read.nextInt();

		//Creamos i, y la incrementamos mientras sea menor o igual a numero
		for(int i = 2; i<=numero; i++) {
			
			//Incrementamos el contador de los primos en 1 cada vez que se ejecute el bucle
			contPrimo++;
			
			//Creamos j y la incrementos mientras sea menor a i 
			for(int j = 2; j<i; j++) {
				
				//Si i entre j da de resto 0, decrementamos el contador de primos en 1
				if(i%j==0) {
					contPrimo--;
					
					//Salimos del bucle
					break;
				}
			}
		}
		
		//Mostramos el número de primos que se encuentra en el rango por pantalla
		System.out.println("Del 2 al " + numero + " hay " + contPrimo + " números primos");
		
		//Cerramos el Scanner 
        read.close();

	}

}
