package projects;

import java.util.Scanner;

public class Ejercicio2AscensorLimitePeso {
    
    
    public void correrEjercicio2(){
        //Declaramos las variables
        
        int peso;
        int piso;
        boolean pesoMax;
        
        //creamos objeto Scanner
        Scanner datos = new Scanner(System.in);
        
        //Solicitamos peso y guardamos
        
        System.out.print("Ingrese su peso en número entero: ");
        peso = datos.nextInt();
        
        //Solicitamos y guardamos piso
        
        System.out.print("Ingrese piso: ");
        piso = datos.nextInt();
        
                
        //Condicionamos a que el peso esté en el rango 0 a 900
        pesoMax = (peso <= 900);
        
        //Mostrar mensaje
        
        if(pesoMax){
            System.out.println("El ascensor se mueve al piso " + piso + ".");
        }
        else{
            System.out.println("El ascensor está sobre cargado");
        } 
        datos.close();
    }
    
}
