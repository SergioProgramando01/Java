/*
Crea un programa que funcione como una agenda de contactos. Utiliza un bucle para permitir al
usuario agregar contactos a la agenda. Cada contacto debe incluir un nombre y un número de
teléfono. Al final, muestra la lista de contactos registrados.
 */
package projects;

import java.util.Scanner;

public class Ejercicio25AgendaContactos {
    
        Scanner datoIngresado = new Scanner(System.in);

    public void correrEjercicio25() {

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
