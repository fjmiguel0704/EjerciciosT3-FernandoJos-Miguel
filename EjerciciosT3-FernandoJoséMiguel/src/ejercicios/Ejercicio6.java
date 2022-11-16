package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
    	
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
