package projects;

import java.util.Scanner;

public class Ejercicio5AscensorPisoTemperatura {
    public void correrEjercicio5(){
        
        Scanner datos = new Scanner(System.in);
        
        int temperatura;
        int piso;
        boolean rango;
        
        System.out.println("Ingrese temperatura en °C: ");
        temperatura = datos.nextInt();
        
        System.out.println("Ingrese piso: ");
        piso = datos.nextInt();
        
        rango = (temperatura >= 18 && temperatura <= 25 );
        
        if(rango){
            System.out.println("El ascensor se mueve al piso " + piso + ".");
        }
        else {
            System.out.println("La temperatura de " + temperatura + " °C no es adecuada y no permite el movimiento del ascensor.");
        }  
        datos.close();
    }    
}
