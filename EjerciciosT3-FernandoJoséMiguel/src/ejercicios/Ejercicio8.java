package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
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
