/*
Crea un programa que simule el proceso de ventas en una tienda. Utiliza un bucle para registrar
las ventas de varios productos. Debes solicitar el nombre del producto, su precio y la cantidad
vendida. Al finalizar, muestra el total de ventas y los productos vendidos.
 */
package projects;

import java.util.Scanner;

public class Ejercicio27ProcesoTiendaVentas {
    
        Scanner datoIngresado = new Scanner(System.in);

    public void correrEjercicio27() {

        // Declaración de variables
        int cantidadNumeros;
        double numero, sumaTotal = 0;

        // Solicitar cantidad de números
        System.out.println("Ingrese la cantidad de números que desea sumar: ");
        cantidadNumeros = datoIngresado.nextInt();

        // Bucle para ingresar y sumar los números
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            while (!datoIngresado.hasNextDouble()) { // Validación de número
                System.out.println("Entrada no válida. Ingrese un número válido:");
                datoIngresado.next();
            }
            numero = datoIngresado.nextDouble();
            sumaTotal += numero;
        }

        // Mostrar el resultado de la suma
        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
    }
    
}
