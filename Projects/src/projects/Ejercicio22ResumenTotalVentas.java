/*
Escribe un programa que simule un registro de ventas. El usuario puede ingresar los productos
vendidos y sus precios. Utiliza un bucle para registrar ventas hasta que el usuario decida
finalizar. Luego, muestra el monto total de las ventas y un resumen de los productos vendidos.
 */

import java.util.Scanner;

public class Ejercicio22ResumenTotalVentas {

  Scanner datoIngresado = new Scanner(System.in);

  public void correrEjercicioResumenTotalVentas() {

    //Declaración de variables
    String producto;
    double precio;
    double totalVentas = 0; //Totaliza las ventas
    int contadorVentas = 0; //Cuenta el número de ventas realizadas
    String resumenProductos = ""; 
    String respuesta = "si";

    //Inicio del bucle mientras el usuario desee ingresar más productos

    do {
      contadorVentas++;
      System.out.println("Ingrese el nombre del producto: ");
      producto = datoIngresado.nextLine();
      System.out.println("Ingrese el precio del producto: ");
      precio = datoIngresado.nextDouble();
      totalVentas += precio;
// El contador resumen productos es un acumulador de texto que mostrará el resumen de los productos ingresados, por ejemplo: 
      
      resumenProductos += contadorVentas + "." +
          " Producto " + producto +
          " Precio: " + precio + "\n" +
          "--------------------------";
      datoIngresado.nextLine();
      System.out.println("¿Desea ingresar otro producto? Si / No");
      respuesta = datoIngresado.nextLine().toLowerCase();
    } while (respuesta.equals("si"));
    System.out.println("El total de ventas es: " + totalVentas);
    System.out.println("El resumen de ventas es: " + resumenProductos);
  }
}