/*
Crea un programa que simule un viaje en coche. 

El usuario debe ingresar la distancia total del
viaje y la velocidad promedio del coche. 

El programa debe calcular el tiempo estimado de viaje.

Luego, debe preguntar si el usuario desea hacer otro viaje. 

El bucle "Mientras" debe permitir
simular múltiples viajes y calcular el tiempo para cada uno.
 */
package projects;

import java.util.Scanner;

public class Ejercicio14ViajeCoche {
    
    public void correrEjercicio14(){  
        
        Scanner datoIngresado = new Scanner(System.in);
        
        int respuesta;
        int numeroViaje=0;
        
        System.out.print("¿Desea hacer otro viaje? Si=1 No=2 \n");
        respuesta = datoIngresado.nextInt();
        
        while(respuesta == 1){
            
            double distancia;
            double velocidad;

            System.out.print("Ingrese distancia total en kilómetros: \n");
            distancia = datoIngresado.nextDouble();

            System.out.print("Ingrese velocidad promedio: \n"); 
            velocidad = datoIngresado.nextDouble();

            //Fórmula: t = d/v
            double tiempo = distancia / velocidad;
            numeroViaje++; 
            
            System.out.print("La velocidad promedio es "+velocidad+" \n"
                    + "km/h");            
            System.out.print("*****************************************");
            
            
            System.out.print("¿Desea hacer otro viaje? Si=1 No=2");
            respuesta = datoIngresado.nextInt();            
        }
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
    }
    

    
    
    
    

    
    
    
}
