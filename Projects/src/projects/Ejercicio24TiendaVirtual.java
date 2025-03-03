/*
Escribe un programa que permita a un usuario realizar operaciones de compra en una tienda
virtual. Utiliza un bucle para que el usuario pueda agregar varios productos a su carrito de
compras. Debes solicitar el nombre del producto y su precio, y luego mostrar el total de la
compra y los productos agregados. Acumulador
 */
package projects;

import java.util.Scanner;

public class Ejercicio24TiendaVirtual {    
    
    Scanner datoIngresado = new Scanner(System.in);

    public void correrEjercicio24() {

        // Declaración de variables
        int cantidadProductos;
        String producto;
        double precio, totalCompra = 0;
        String resumenCompras = "";

        // Solicitar cantidad de productos
        System.out.println("Ingrese la cantidad de productos a comprar: ");
        cantidadProductos = datoIngresado.nextInt();
        datoIngresado.nextLine(); // Limpiar buffer

        // Bucle para registrar cada producto
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ": ");
            producto = datoIngresado.nextLine();
            System.out.println("Ingrese el precio del producto " + i + ": ");
            precio = datoIngresado.nextDouble();
            datoIngresado.nextLine(); // Limpiar buffer

            totalCompra += precio;
            resumenCompras += i + ". Producto: " + producto + " - Precio: $" + precio + "\n";
        }

        // Mostrar el resumen
        System.out.println("\nResumen de compra:\n" + resumenCompras);
        System.out.println("Total de la compra: $" + totalCompra);
    }
}
