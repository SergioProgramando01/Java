/*
Desarrolla un programa que simule el registro de vehículos en un parqueadero. El programa
debe solicitar al usuario el número de vehículos que ingresarán al parqueadero. Luego,
mediante un bucle, solicita la placa de cada vehículo y registra la hora de ingreso. Al finalizar,
muestra un resumen de los vehículos registrados con sus respectivas placas y horas de ingreso.
Usar variables para acumular información de carros.

 */
package projects;

import java.util.Scanner;

public class Ejercicio23Parqueadero {
    

    Scanner datoIngresado = new Scanner(System.in);

    public void correrEjercicio23() {

        // Declaración de variables
        int numeroVehiculos;
        String placa, horaIngreso;
        String resumenVehiculos = "";

        // Solicitar número de vehículos
        System.out.println("Ingrese la cantidad de vehículos que ingresarán al parqueadero: ");
        numeroVehiculos = datoIngresado.nextInt();
        datoIngresado.nextLine(); // Limpiar buffer

        // Bucle para registrar cada vehículo
        for (int i = 1; i <= numeroVehiculos; i++) {
            System.out.println("Ingrese la placa del vehículo " + i + ": ");
            placa = datoIngresado.nextLine();
            System.out.println("Ingrese la hora de ingreso del vehículo " + i + ": ");
            horaIngreso = datoIngresado.nextLine();
            
            resumenVehiculos += i + ". Placa: " + placa + " - Hora: " + horaIngreso + "\n";
        }

        // Mostrar el resumen
        System.out.println("\nResumen de vehículos registrados:\n" + resumenVehiculos);    
}
}
