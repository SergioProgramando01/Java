/*
Crea un programa que simule un sistema de clasificación para un campeonato deportivo. El
programa debe solicitar al usuario que ingrese el resultado de un partido (ganado, perdido o
empatado) y, según el resultado, otorgar puntos a los equipos y mostrar la clasificación actual.
 */
package projects;
import java.util.Scanner;

public class Ejercicio9Campeonato {
    
    public void correrEjercicio9(){
        
        Scanner datoIngresado = new Scanner(System.in);
        
        String resultado;
        
        
        System.out.println("Ingrese resultado del partido: G (Ganado) P (Perdido) E (Empatado)");
        resultado = (datoIngresado.next()).toUpperCase();      
        
        switch(resultado){
            case "G":
                System.out.println("Punto: 3 \nClasificación: Primer lugar");
                break;
            case "E":
                System.out.println("Punto: 1 \nClasificación: Segundo lugar"); 
                break;
            case "P":   
                System.out.println("Punto: 0 \nClasificación: Último lugar");
                break;
        }
    }
}
