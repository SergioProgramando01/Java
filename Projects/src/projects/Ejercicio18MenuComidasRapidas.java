/*  

Crea un programa que simule un menú de comidas rápidas. El usuario puede elegir entre
diferentes opciones de menú, cada una con un precio. Utiliza un bucle para permitir al usuario
realizar pedidos hasta que decida finalizar. Luego, muestra el costo total de los pedidos y un
mensaje de agradecimiento.

*/

import java.util.Scanner;

public class Ejercicio18MenuComidasRapidas {

  Scanner datoIngresado = new Scanner(System.in);

    public void crearMenu() {

        int opcion;
        double costoTotal = 0;
        String respuesta = "si";

        System.out.println("----- MENÚ DE COMIDAS RÁPIDAS -----\n");

        System.out.println("1. Hamburguesa - $10000");
        System.out.println("2. Pizza - $20000");
        System.out.println("3. Salchipapas - $15000");


        do {
            System.out.println("\n Ingrese una opción: ");          
            opcion = datoIngresado.nextInt();

            switch(opcion) {
                case 1:
                    costoTotal += 10000;
                    break;
                case 2:
                    costoTotal += 20000;
                    break;
                case 3:
                    costoTotal += 15000;
                    break;                
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    continue;
            }
          
            // Preguntar si desea realizar otro pedido
          
            System.out.println("¿Desea agregar otro pedido? Si / No");
            datoIngresado.nextLine();  
            respuesta = datoIngresado.nextLine();

        } while(respuesta.equalsIgnoreCase("si"));  

        System.out.println("El costo total de los pedidos es: $" + costoTotal);
        System.out.println("----- GRACIAS POR SU VISITA A COMIDAS RÁPIDAS DONDE SERGIO -----");
    }
}
