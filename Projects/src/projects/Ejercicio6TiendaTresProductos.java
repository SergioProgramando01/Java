package projects;

import java.util.Scanner;

public class Ejercicio6TiendaTresProductos {
    
    Scanner datoIngresado = new Scanner(System.in);
    
    //Declaramos las variables
    
    String producto;
    int cantidad;
    int precio = 100;
    float subtotal;
    double total;
    double descuento;
    
    //Método único que correrá en el main
    
    public void correrEjercicio6(){
        
        System.out.println("Ingrese tipo de producto que desea comprar. A, V o E");
        
        producto = datoIngresado.next();
        
        System.out.println("Cantidad de unidades. ");
        
        cantidad = datoIngresado.nextInt();        

        
        if(cantidad>0){            
            switch(producto){
            case "A": 
                
                System.out.println("Subtotal: \n"+
                        (subtotal = (cantidad*precio))+"\n"+
                        "Total: \n"+
                        (total = (subtotal-(descuento = (subtotal*0.10))))); 
                break;
            case "V":
                
                System.out.println("Subtotal: \n"+
                        (subtotal = (cantidad*precio))+"\n"+
                        "Total: \n"+
                        (total = (subtotal-(descuento = (subtotal*0.05)))));  
                break;
            case "E":

                
                System.out.println("Subtotal: \n"+
                        (subtotal = (cantidad*precio))+"\n"+
                        "Total: \n"+
                        (total = subtotal)); 
                break;
        }
        }
        else{
            System.out.print("Cantidad errónea, ingrese número positivo. ");
        }
        datoIngresado.close();
    }
}
