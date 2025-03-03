/*
Diseña un programa que simule un cajero automático. El usuario debe ingresar el monto que desea
retirar. El programa debe verificar que el monto no exceda el saldo disponible en la cuenta. Si el
monto es mayor que el saldo, se debe mostrar un mensaje de error. Si el monto es válido, el
programa debe calcular y mostrar el saldo restante.
 */
package projects;

import java.util.Scanner;

public class Ejercicio11CajeroAutomatico {
    
    Scanner datoIngresado = new Scanner(System.in);
    
    public void correrEjercicio11(){
        
        double saldoCuenta = 1000000;
        double retiroUsuario;
        String respuesta = "si";       
        
        while(respuesta.equals("si")){            
            
            System.out.println("¿Cuánto desea retirar ?");
            retiroUsuario =datoIngresado.nextDouble();
            
            if(saldoCuenta >= retiroUsuario ){    
                
                saldoCuenta-=retiroUsuario;  
                
            }else{
                System.out.println("Error, monto excede su saldo. ");
            }
            
            System.out.println("Su saldo restantes es "+saldoCuenta);
            
            System.out.println("¿Desea realizar otro retiro ?");
            respuesta = datoIngresado.next();   
        }
        System.out.println("GRACIAS POR VISITAR BANSERGIO");
    }
}
