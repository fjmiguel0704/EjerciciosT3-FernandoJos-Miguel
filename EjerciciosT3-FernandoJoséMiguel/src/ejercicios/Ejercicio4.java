package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		//Guardará el primer dato introducido por teclado
		int num1=0;
		
		//Guardará el segundo dato introducido por teclado
		int num2=0;
		
		//Resultado del miínimo comúm nultiplo de ambos
		int resultado = 0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos los dos números al usuario y declaramos las variables
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		//Mientras el número 2 sea distinto a 0
	    while (num2 != 0) {
	    	
	    	//Resultado será el número 2
	    	resultado = num2;
	    	
	    	//El número 2 el resto de la división de número 1 entre número 2
	        num2 = num1 % num2;
	        
	        //El número 1 será igual al resultado
	        num1 = resultado;
	    }
	    
	    //Mostramos el resultado
	    System.out.println("El máximo común divisor es: " + resultado);
	    
	    //Cerramos el Scanner
	    read.close();
	}

}


