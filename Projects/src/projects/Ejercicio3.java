
package projects;

import java.util.Scanner;

public class Ejercicio3 {
    public void correrEjercicio3(){
        
        //Declaramos variables
        
        int temperatura;
        boolean rango;
        
        //Objeto scanner
        
        Scanner datoIngresado = new Scanner(System.in);
        
        //Solicitar temperatura al usuario
        
        System.out.println("Ingrese temperatura en °C: ");
        temperatura = datoIngresado.nextInt();
        
        //Procesar dato que esté en el rango 18 a 25
        
        rango = (temperatura >= 18 && temperatura <= 25);
        
        //Mostramos mensaje
        if(rango){
            System.out.println("La temperatura de " + temperatura + " °C es adecuada.");
        }
        else{
            System.out.println("La temperatura de " + temperatura + " °C está fuera del rango deseado");
        }

    }    
}
