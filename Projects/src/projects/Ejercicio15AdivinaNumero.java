/*
Diseña un programa que simule una cuenta regresiva. El usuario debe ingresar un número
entero positivo y el programa debe comenzar a contar hacia atrás desde ese número hasta
llegar a cero. Muestra cada número en la cuenta regresiva y finaliza con un mensaje de
"¡Tiempo cumplido!".
 */
package projects;

import java.util.Scanner;

public class Ejercicio15AdivinaNumero {
    
    Scanner datoIngresado = new Scanner(System.in);
    
    public void correrEjercicio15(){
        
        int numero;        
        
        System.out.println("Ingrese número ");
        numero = datoIngresado.nextInt();
        
        while(numero != 0){
            numero--;
            System.out.println("Número " + numero);
        }
        System.out.println("¡Tiempo Cumplido!");  
    }
    
}
