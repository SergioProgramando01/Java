/*
Desarrolla un juego simple de adivinanza en el que el programa genera un número aleatorio
entre 1 y 100. El usuario debe intentar adivinar el número. El programa debe proporcionar
pistas (mayor o menor) y permitir al usuario seguir adivinando hasta que lo adivine
correctamente. Utiliza un bucle "Mientras" para controlar el flujo del juego.
 */
package projects;


import java.util.Scanner;
import java.util.Random;

public class Ejercicio16Juego1A100 {
    
    public void correrEjercicio16(){
        
        Scanner datoIngresado = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int numero;
        int numeroAleatorio = 50;

        
        System.out.println("Ingrese número: ");
        numero = datoIngresado.nextInt();
        
        while(numero != numeroAleatorio){   
            
            if(numero > numeroAleatorio){
                System.out.println("Menor ");  
            }else{
                System.out.println("Mayor ");
            }
        System.out.println("Ingrese número: ");
        numero = datoIngresado.nextInt();      
        }
        System.out.println("Felicitaciones, adivinaste ");
    }    
}
