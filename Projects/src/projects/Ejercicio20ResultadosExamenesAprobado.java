/*
Desarrolla un programa que permita al usuario ingresar sus resultados de exámenes. El
programa debe calcular el promedio de los resultados y determinar si el estudiante ha aprobado
o reprobado. Utiliza un bucle para solicitar los resultados hasta que el usuario decida no ingresar
más resultados.
*/
import java.util.Scanner;

class Ejercicio20ResultadosExamenesAprobado {

  Scanner datoIngresado = new Scanner(System.in);
  
  public void correrEjercicio16(){
    
    double calificacion;
    int contadorNumCalificacion = 0;
    double sumaCalificacion = 0;   
    String respuesta = "si";
    double promedio = 0;

    System.out.println("----- PROMEDIO DE EXÁMENES -----\n");

    do{  
      
      System.out.println("Ingrese la calificación del examen de 1 a 100:");
      calificacion = datoIngresado.nextDouble();
      
      if(calificacion >= 1 && calificacion <= 100){
        sumaCalificacion += calificacion;
        contadorNumCalificacion++;  
        System.out.println("¿Desea ingresar otra calificación? Si / No"); 
        datoIngresado.nextLine();
        respuesta = datoIngresado.nextLine().toLowerCase();
      }else
      {System.out.println("Calificación no válida");}
    } while(respuesta.equals("si"));

    System.out.println("El promedio de las calificaciones es "+ promedio + " y "+ "AQUI VA EL APROBADO O REPROBADO");    
    }

  public String mostrarResultado(double promedio){
    if(promedio >= 70){      
      String resultado = "el estudiante ha aprobado";
      return resultado;   
    }else{  
      String resultado = "el estudiante ha reprobado";
      return resultado;     
    }    
  }

  public double calcularPromedio(double sumaCalificacion, int contadorNumCalificacion){
    double promedio = sumaCalificacion / contadorNumCalificacion;
    return promedio;
  }
  }