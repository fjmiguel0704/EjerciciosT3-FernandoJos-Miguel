package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

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
    	 * 22
    	 * 333
    	 * 4444
    	 * 55555
    	 * 666666
    	 * Resultado obtenido: 
    	 * 1
    	 * 22
    	 * 333
    	 * 4444
    	 * 55555
    	 * 666666
    	 */
    	
    	//Número guardará el dato introducido por teclado
        int numero;
        
        //Creamos el Scanner para leer por teclado
        Scanner read = new Scanner (System.in);
        
        //Le pedimos al usuario un número y declaramos la variable
        System.out.println("Introduce un número: ");
        numero=read.nextInt();
        
        //Incrementamos i mientras sea menor o igual al número
        for(int i=1; i<=numero; i++) {
        	
        	//Incrementamos j mientras sea menor o igual a i e imprimimos i
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            
            //Imprimimos un salto de línea
            System.out.println();
        }
        
        //Cerramos el Scanner 
        read.close();

    }

}
