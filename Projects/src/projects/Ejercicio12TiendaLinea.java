/*
Crea un programa que simule una compra en una tienda en línea. El usuario debe ingresar el
precio de un producto y la cantidad que desea comprar. El programa debe calcular el costo total y
mostrarlo. Luego, debe solicitar si el usuario desea agregar otro producto. El bucle "Mientras" debe
permitir agregar múltiples productos y calcular el costo total de la compra.
 */
package projects;

import java.util.Scanner;

public class Ejercicio12TiendaLinea {
    
    public void correrEjercicio12(){
        
        Scanner datoIngresado = new Scanner(System.in);
        
        double precio;
        int cantidad;        
        double costoTotal=0;
        String respuesta = "si";
        
        while(respuesta.equals("si")){
            
            System.out.println("Precio producto ");
            precio = datoIngresado.nextDouble();
            
            System.out.println("Cantidad ");
            cantidad = datoIngresado.nextInt();
            
            double subTotal = precio * cantidad;
            costoTotal+=subTotal;            
            
            System.out.println("¿Desea agregar otro producto Si / No? ");
            respuesta = datoIngresado.next();
        }  
        System.out.println("El costo total de la compra es: "+costoTotal+"\n");
        System.out.println("GRACIAS POR VISITAR NUESTRO SUPERMARKET SERGIO");  
    }    
}
