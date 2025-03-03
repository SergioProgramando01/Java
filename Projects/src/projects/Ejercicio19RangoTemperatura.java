import java.util.Scanner;

/*

Escribe un programa que simule un sensor de temperatura. El usuario ingresa la temperatura
actual, y el programa verifica si está dentro de un rango aceptable (por ejemplo, entre 18°C y
25°C). Si no está dentro del rango, muestra una alerta y continúa solicitando la temperatura
hasta que esté dentro del rango.

*/
class Ejercicio19RangoTemperatura {

  Scanner datoIngresado = new Scanner(System.in);  

    public void correrEjercicio15() {

    System.out.println("----- SENSOR DE TEMPERATURA -----\n");

    int temperaturaActual;    

    do {
      
      System.out.println("Ingresar la temperatura actual:");
      temperaturaActual = datoIngresado.nextInt();

      if (temperaturaActual < 18 || temperaturaActual > 25){
        System.out.println("¡Alerta!");
      }       
      
    } while(temperaturaActual<18 || temperaturaActual>25);

    System.out.println("La temperatura está dentro del rango aceptable");
      System.out.println("\n -------------Termómetro desarrollado por laboratorios LabSergio---------------");
  }
  
}