package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Número guardará el dato introducido por teclado
		int numero;
		
		//Auxiliar para el número
		int auxiliar;
		
		//Guardará el número al revés
		int numInvert=0;
		
		//Resto de la división
		int resto=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario un número y declaramos la variable
		System.out.println("Introduce un número");
        numero=read.nextInt();
		
        //La variable auxiliar guarda el valor del número
		auxiliar=numero;

		//Mientras que auxiliar sea distinto a 0
		while(auxiliar!=0) {
			
			//El resto guardará el resto de la división de el valor de auxiliar entre 10 
			resto=auxiliar%10;
			
			//El número invertido guardará el resultado de multiplicar el número invertido por 10 y sumarle el resto
			numInvert=numInvert*10+resto;
			
			//Y el valor de auxiliar pasará a ser el resultado de dividir auxiliar entre 10
			auxiliar/=10;	
		}
		
		//Una vez terminado el bucle comprobamos, que si el número invertido es igual al número introducido, es capicúa
	    if(numInvert==numero){
	    	System.out.println("Es capicúa");
		}
	    
	    //Si no, no es capicúa
	    else {       
        System.out.println("No es capicúa");		
		}
	    
	    //Cerramos el Scanner
	    read.close();
	    
		
		}
	}


