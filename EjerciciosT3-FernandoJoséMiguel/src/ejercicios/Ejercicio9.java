package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		/*Pruebas: 
    	 * -0 ejecuciones: 
    	 * Introduzco 0. Resultado esperado: "Error". Resultado obtenido: "Error"
    	 * -1 ejecución:
    	 * Introduzco 1. Resultado esperado: "1 dígito". Resultado obtenido: "1 dígito"
    	 * -Máximas ejecuciones:
    	 * No se puede realizar 
    	 * -Valor intermedio de ejecuciones:
    	 * Introduzco 10. Resultado esperado: "10 dígitos". Resultado obtenido: "10 dígitos"
    	 */
		
		//Número guardará el dato introducido por teclado
		long numero;
		
		//Contador de dígitos del número
		int digitos=1;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Dime un número: ");
		numero=read.nextLong();
		
		//Si el número es mayor a 0
		if(numero>0) {
			
			//Mientras que el número sea mayor o igual a 10
			while(numero>=10) {
				
				//Divide el número entre 10 e incrementa los dígitos en 1
				numero/=10;
				digitos++;
			}
			
			//Muestra los dígitos que tiene el número
			System.out.println("El número tiene " + digitos + " dígitos");
		} 
		
		//En caso de que el número sea 0, muestra un mensaje de error
		else {
			System.out.println("Error, el número debe ser mayor que 0");
		}
		
		//Cerramos el Scanner
		read.close();
			

	}

}
