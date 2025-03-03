/*
Desarrolla un programa que simule el funcionamiento de una impresora. El usuario debe ingresar la
cantidad de páginas que desea imprimir. 

El programa debe verificar que la cantidad de páginas no
exceda la capacidad de papel en la impresora. 

Si es así, debe imprimir las páginas y actualizar la
cantidad de papel restante. 

El bucle "Mientras" debe permitir al usuario imprimir múltiples páginas
hasta que no haya papel suficiente.
 */

package projects;

import java.util.Scanner;

public class Ejercicio13Impresora {

    public void correrEjercicio13(){   
        
        Scanner datoIngresado = new Scanner(System.in);    

        int papelImpresora = 1000;
        int paginasImprimir;
                
        while( papelImpresora > 0 ){
            
            System.out.print("Páginas imprimir: \n");        
            paginasImprimir = datoIngresado.nextInt();
            
            if(paginasImprimir<=papelImpresora){
                papelImpresora -= paginasImprimir;
            } else {
                System.out.print("No hay papel en la impresora. ");
            }
            
            if (papelImpresora == 0){
                System.out.println("No hay papel en la impresora. ");
            }
        }
        
        datoIngresado.close();
    }  
}

