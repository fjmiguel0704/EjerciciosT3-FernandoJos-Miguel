package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Pruebas: 
    	 * -0 ejecuciones: 
    	 * Introduzco 1 y 1. Resultado esperado: "1". Resultado obtenido: "1"
    	 * -1 ejecución:
    	 * Introduzco 2 y 2. Resultado esperado: "2". Resultado obtenido: "2"
    	 * -Máximas ejecuciones:
    	 * No se puede realizar 
    	 * -Valor intermedio de ejecuciones:
    	 * Introduzco 6 y 9. Resultado esperado: "18". Resultado obtenido: "18"
    	 */
		
		//Guardará el primer dato introducido por teclado
		int num1=0;
		
		//Guardará el segundo dato introducido por teclado
		int num2=0;
		//Resultado del miínimo comúm nultiplo de ambos 
		int resultado = 1;
		
		//Multiplicador de ambos números 
		int multiplicador=2;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos los dos números al usuario y declaramos las variables
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		//Mientras el multiplicador sea menor o igual a numero 1 y numero 2
		 while(multiplicador <= num1 || multiplicador <= num2) {
			 
			 	//multiplica el multiplicador por el resultado si los números divididos entre el multiplicador tienen de resto 0
	            if(num1%multiplicador==0 || num2%multiplicador==0){
	            resultado*=multiplicador;
	            
	            //Divide el primer número por el multiplicador si el resto de numero 1 entre el multiplicador es 0
	            if(num1%multiplicador==0) {
	            	num1/=multiplicador;
	            }
	            
	            //Divide el segundo número por el multiplicador si el resto de numero 2 entre el multiplicador es 0
	            if(num2%multiplicador==0) {
	            	num2/=multiplicador;
	            }
	            
	            }
	            
	            //En caso contrario, incrementa el multiplicador
	            else {
	            	multiplicador+=1; //Se repite el bucle 
	            }
	        }  
		 
		 	//Ya finalizado el bucle mostramos el resultado
	        System.out.println("El mínimo comúm múltiplo es: " + resultado);    
	        
	        //Cerramos el Scanner 
	        read.close();
	        
	        }         
	    }


