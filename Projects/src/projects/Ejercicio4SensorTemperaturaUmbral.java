package projects;

import java.util.Scanner;

public class Ejercicio4SensorTemperaturaUmbral {
    public void correrEjercicio4(){
        //Variables
        int temperatura;
        int umbralAlerta = 45;
        boolean mensaje;
        //Objeto Scanner
        Scanner datoIngresado = new Scanner(System.in);
        //Asignar valores
        System.out.println("Ingrese temperatura en °C: ");
        temperatura = datoIngresado.nextInt();
        //Procesar dato 
        mensaje = (temperatura<=umbralAlerta);
        //Mostrar mensaje
        if(mensaje){
            System.out.println("La temperatura es normal");
        }
        else {
            System.out.println("¡Alerta!");
        } 
        datoIngresado.close();
    }    
}
