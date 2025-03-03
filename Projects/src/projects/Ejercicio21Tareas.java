/*
Crea un programa que simule la gestión de tareas. El usuario puede ingresar tareas con sus
descripciones y fechas de vencimiento. Utiliza un bucle para permitir al usuario agregar tareas
hasta que decida no agregar más. Al final, muestra la lista de tareas. Usar un acumulador de
texto.
 */
package projects;

import java.util.Scanner;

public class Ejercicio21Tareas {
    
    public void correrEjercicio21(){
        
        Scanner datoIngresado = new Scanner(System.in);
        
        String tarea;
        String descripcion;
        int dia;
        String mes;
        String acumuladorTareas = "";
        int contadorTareas = 1;
        String respuesta = "si";
        
        do{
            //Ingresamos ítems
            
            System.out.println("Ingrese tarea: ");
            tarea = datoIngresado.nextLine();
            System.out.println("Descripción: ");
            descripcion = datoIngresado.nextLine();
            System.out.println("Fecha de vencimiento ");
            System.out.println("Dia: ");
            //datoIngresado.nextLine();
            dia = datoIngresado.nextInt();
            String diaText = String.valueOf(dia);
            System.out.println("Mes: ");
            mes = datoIngresado.next();            
            acumuladorTareas += 
                    "-------------------\n"+
                    contadorTareas++ + ". " +
                    "Tarea: "+ tarea + "\n"+
                    "Descripción: "+ descripcion + "\n"+
                    "Fecha Vencimiento: Dia "+diaText+" Mes "+mes+
                    "\n-------------------\n";
            
            System.out.println("¿Desea ingresar otra tarea? Si / No ");
            respuesta = datoIngresado.next().toLowerCase();
            datoIngresado.nextLine(); 
        }while(respuesta.equals("si"));
        
        System.out.println(acumuladorTareas);
        datoIngresado.close();
    }
}
