package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Numero va a guardar el dato introducido por teclado
		int numero;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Introduce un número: ");
		numero=read.nextInt();
		
		//Incrementamos i mientras sea menor o igual a numero
		for(int i=1;i<=numero;i++) {
			
			//Incrementamos b mientras sea menor o igual al numero menos el valor de i, e imprimimos un espacio en blanco
			for (int b =1 ; b<=numero-i;b++) {
				System.out.print(" ");
			}
			
			//Incrementamos a mientras sea menor o igual a i, e imprimimos un asterisco y seguido un espacio
			for(int a=1; a<=i;a++) {
				System.out.print("* ");
			}
			
			//Imprimimos un salto de línea
			System.out.println();
			
		}
		
		//Cerramos el Scanner
		read.close();

	}

}
