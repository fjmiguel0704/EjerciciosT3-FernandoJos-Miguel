package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Creamos las variables. Horas, minutos y segundos. Además de segIncre, que serán los segundos que el usuario desee incrementar
        int horas, minutos, segundos, segIncre=0;
        
        //Creamos el Scanner para leer por teclado
        Scanner read = new Scanner (System.in);
        
        //Le pedimos al usuario las horas
        System.out.println("Introduce las horas: ");
        
        //Declaramos la variable horas, que guardará la introducida por el usuario
        horas=read.nextInt();
        
        //Le pedimos al usuario las minutos
        System.out.println("Introduce los minutos: ");
        //Declaramos la variable horas, que guardará los introducidos por el usuario
        minutos=read.nextInt();
        
        //Le pedimos al usuario los segundos
        System.out.println("Introduce los segundos: ");
        //Declaramos la variable segundos, que guardará los introducidos por el usuario
        segundos=read.nextInt();
        
        //Le pedimos al usuario los segundos que desea incrementar a la hora
        System.out.println("¿Cuántos segundos desea incrementar en su hora?: ");
        
        //Declaramos la variable segIncre, que guardará los segundos a incrementar
        segIncre=read.nextInt();
        
        
        //Si la hora introducida es mayor a 23 o menor a 0, muestra un error
        if(horas>23||horas<0) {
            System.out.println("ERROR: ¡La hora introducida no es correcta!");
            
        //En caso contrario, si los minutos introducidos son mayor a 59 o menor que 0, muestra un error
        } else if (minutos>59||minutos<0) {
            System.out.println("ERROR: ¡Los minutos introducidos no son correctos!");
            
        //En caso contrario, si los segundos introducidos son mayor a 59 o menor que 0, muestra un error
        } else if (segundos>59||segundos<0) {
            System.out.println("ERROR: ¡Los segundos introducidos no son correctos!");
            
        //En caso contrario, si los segundos a incrementar introducidos son menor que 0, muestra en error
        } else if (segIncre<0) {
            System.out.println("ERROR: ¡Los segundos a incrementar introducidos no son correctos!");
            
        //Y en caso contrario a todo lo anterior, haz lo siguiente:
        } else {
            
            //Le añadimos esos segundos de más a la variable segundos
            segundos+=segIncre;
            
            //Mientras que segundos sea mayor a 59
            while(segundos>59) {
                
                //Le restamos sesenta a segundos e incrementamos minutos en 1
                segundos-=60;
                minutos++;
                
                //Si los minutos superan los 59 segundos, que pasen a ser 0 e incremente una hora
                if(minutos>59) {
                    minutos=0;
                    horas++;
                }
                
                //Y si las horas superan las 23, que pasen a ser 0
                if(horas>23) {
                    horas=0;
                }    
                
                    
                }
            
            //Mostramos las horas, minutos y segundos finales
            System.out.println(horas + "h" + " : " + minutos + "m" + " : " + segundos + "s");
        }
        
            
            
            //Cerramos el Scanner
            read.close();
                
        }
        
        

    }
