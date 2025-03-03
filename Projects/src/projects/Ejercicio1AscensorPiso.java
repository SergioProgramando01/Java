package projects;

import java.util.Scanner;


public class Ejercicio1AscensorPiso {
    public void correrEjercicio1(){
        int piso;          // Variable para almacenar el piso
        boolean resultado; // Variable para almacenar el resultado de la validación
        
        // Solicitar al usuario el ingreso del piso
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese piso");
        piso = scanner.nextInt(); // Asignamos el valor de 'piso' ingresado por el usuario

        // Procesar el piso, verificando si está entre 1 y 10
        resultado = (piso >= 1 && piso <= 10);

        // Mostrar el resultado
        if(resultado){
            System.out.println("Ascensor se mueve al piso " + piso + ".");
        } else {
            System.out.println("El piso " + piso + " no existe.");
        }
        scanner.close();
    }
}
    