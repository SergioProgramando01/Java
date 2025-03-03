/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.util.Scanner;

public class projects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datoIngresado = new Scanner(System.in);
        
        int opcion;

        do {
            // Menú de selección de ejercicios
            System.out.println("\nSeleccione el número del ejercicio a ejecutar (1-27) o 0 para salir:");
            opcion = datoIngresado.nextInt();

            switch (opcion) {
                case 1:
                    new RegistroParqueadero().correrRegistroParqueadero();
                    break;
                case 2:
                    new CarritoCompras().correrCarritoCompras();
                    break;
                case 3:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 4:
                    new SumaNumeros().correrSumaNumeros();
                    break;
                case 5:
                    new RegistroVentas().correrRegistroVentas();
                    break;
                case 6:
                    new RegistroParqueadero().correrRegistroParqueadero();
                    break;
                case 7:
                    new CarritoCompras().correrCarritoCompras();
                    break;
                case 8:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 9:
                    new SumaNumeros().correrSumaNumeros();
                    break;
                case 10:
                    new RegistroVentas().correrRegistroVentas();
                    break;  
                case 11:
                    new RegistroParqueadero().correrRegistroParqueadero();
                    break;
                case 12:
                    new CarritoCompras().correrCarritoCompras();
                    break;
                case 13:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 14:
                    new SumaNumeros().correrSumaNumeros();
                    break;
                case 15:
                    new RegistroVentas().correrRegistroVentas();
                    break;
                case 16:
                    new RegistroParqueadero().correrRegistroParqueadero();
                    break;
                case 17:
                    new CarritoCompras().correrCarritoCompras();
                    break;
                case 18:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 19:
                    new SumaNumeros().correrSumaNumeros();
                    break;
                case 20:
                    new RegistroVentas().correrRegistroVentas();
                    break;  
                case 21:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 22:
                    new SumaNumeros().correrSumaNumeros();
                    break;
                case 23:
                    new RegistroVentas().correrRegistroVentas();
                    break;
                case 24:
                    new RegistroParqueadero().correrRegistroParqueadero();
                    break;
                case 25:
                    new CarritoCompras().correrCarritoCompras();
                    break;
                case 26:
                    new AgendaContactos().correrAgendaContactos();
                    break;
                case 27:
                    new SumaNumeros().correrSumaNumeros();
                    break;    
                // Aquí agregas los demás ejercicios del 6 al 27 con el mismo patrón
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        datoIngresado.close();
    }
        

        
        
        


        

        

    }
    
}
