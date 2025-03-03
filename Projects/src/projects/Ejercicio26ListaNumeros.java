/*
Escribe un programa que permita al usuario ingresar una lista de números. Utiliza un bucle para
sumar todos los números ingresados y muestra el resultado al final. Asegúrate de validar que los
números ingresados sean válidos.
 */
package projects;

import java.util.Scanner;


public class Ejercicio26ListaNumeros {
    
    Scanner datoIngresado = new Scanner(System.in);

    public void correrEjercicio26() {

        // Declaración de variables
        int cantidadContactos;
        String nombre, telefono;
        String listaContactos = "";

        // Solicitar número de contactos
        System.out.println("Ingrese la cantidad de contactos a registrar: ");
        cantidadContactos = datoIngresado.nextInt();
        datoIngresado.nextLine(); // Limpiar buffer

        // Bucle para registrar cada contacto
        for (int i = 1; i <= cantidadContactos; i++) {
            System.out.println("Ingrese el nombre del contacto " + i + ": ");
            nombre = datoIngresado.nextLine();
            System.out.println("Ingrese el número de teléfono del contacto " + i + ": ");
            telefono = datoIngresado.nextLine();

            listaContactos += i + ". Nombre: " + nombre + " - Teléfono: " + telefono + "\n";
        }

        // Mostrar la lista de contactos
        System.out.println("\nLista de contactos registrados:\n" + listaContactos);
    }
}
