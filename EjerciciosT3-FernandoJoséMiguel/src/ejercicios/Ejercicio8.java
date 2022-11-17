package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*Pruebas: 
    	 * -0 ejecuciones: 
    	 * Introduzco 0. Resultado esperado: 1 número introducido y 0 fallos. Resultado obtenido: 1 número introducido y 0 fallos
    	 * -1 ejecución:
    	 * Introduzco 1 y 0. Resultado esperado: 2 números introducidos y 1 fallo. Resultado obtenido: 2 números introducidos y 1 fallo
    	 * -Máximas ejecuciones:
    	 * Introduzco un número siempre mayor al anterior.  Resultado esperado: Pida otro número. Resultado obtenido: Pida otro número
    	 * -Valor intermedio de ejecuciones:
    	 * Introduzco 6, 9, 12, 11, 0. Resultado esperado: 5 números introducidos y 2 fallos. Resultado obtenido: 5 números introducidos y 2 fallos    	
    	 */
		
		//Número guardará el dato introducido por teclado
		int numero1=1;
		
		//Contador de intentos
		int intento=1;
		
		//Contador de fallos
		int fallos=0;
		
		//Auxiliar para el número 1
		int numero2=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Dime un número: ");
		numero1=read.nextInt();
		
		//Mientras el número 1 sea distinto a 0
		while(numero1!=0) {
			
			//Incrementamos en primer lugar el número de intentos en 1
			intento++;
			
			//El número 2 guarda el valor del número recién introducido
			numero2=numero1;
			
			//Volvemos a pedir un número y declaramos la variable
			System.out.println("Dime un número: ");
			numero1=read.nextInt();
			
			//Si el nuevo número introducido es menor al anterior, incrementamos los fallos en 1 y mostramos un mensaje
			if(numero1<numero2) {
				fallos++;
				System.out.println("Fallo, es menor");
			}

			
		}
		
		//Mostramos el total de intentos y números fallados
		System.out.println("Total de números introducidos: " + intento + "\n" + "Números fallados: " + fallos);
		
		//Cerramos el Scanner
		read.close();

	}

}
