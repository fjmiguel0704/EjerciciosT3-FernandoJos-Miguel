package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*Pruebas: 
    	 * -0 ejecuciones: 
    	 * Introduzco 0. Resultado esperado: nada. Resultado obtenido: nada
    	 * -1 ejecución:
    	 * Introduzco 1. Resultado esperado: "1". Resultado obtenido: "1"
    	 * -Máximas ejecuciones:
    	 * No se puede realizar 
    	 * -Valor intermedio de ejecuciones:
    	 * Introduzco 6. Resultado esperado: 
    	 * 1
		 * 121
		 * 12321
		 * 1234321
		 * 123454321
		 * 12345654321
    	 * Resultado obtenido: 
    	 * 1
		 * 121
		 * 12321
		 * 1234321
		 * 123454321
		 * 12345654321
    	 */
		
		//Número guardará el dato introducido por teclado
		int numero;
		
		//Guardará el incremento de los números de 1 en 1
		int contador=1;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Introduce un número: ");
		numero=read.nextInt();

		//Mientras el contador sea menor al número
		while(contador<=numero) {
			
			//incrementamos i mientras sea menor al contador y la mostramos
			for(int i = 1; i<contador; i++) {
				System.out.print(i);
			}
			
			//Y decrementamos j mientras sea mayor a 0 , y la mostramos
			for(int j=contador; j>0; j--) {
				System.out.print(j);
			}
			
			//Imprimimos un salto de línea e incrementamos contador en 1
			System.out.println();
			contador++; //Se repite el bucle
		}
		
		//Cerramos el Scanner
		read.close();
		
	}

}
