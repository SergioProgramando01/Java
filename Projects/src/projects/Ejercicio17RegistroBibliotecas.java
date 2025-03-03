import java.util.Scanner;

/*
Escribe un programa que simule un registro de bibliotecas. El programa debe permitir al usuario
ingresar información sobre libros, como título, autor y número de páginas. Utiliza un bucle para
solicitar la información del libro y continuar registrando libros hasta que el usuario decida
detenerse. Al final, muestra la lista de libros registrados. Usar un acumulador de texto.
*/

public class Ejercicio17RegistroBibliotecas {

  Scanner datoIngresado = new Scanner(System.in);
  
  // Método que ejecuta el ejercicio 13  

  public void correrEjercicio13(){

    // Creamos objeto Scanner para leer datos ingresados por el usuario



    System.out.println("----- REGISTRO DE BIBLIOTECAS -----\n");
    
    registrarLibro(); // Llamámos el método registrarLibro()
  }

  // Método que permite registrar libros

  public void registrarLibro(){

    System.out.println("Ingrese información del libro. \n");
    String respuesta = "si";
    int acumuladorNumeroLibro = 0;
    String acumuladorTexto = "";

    do {

      String titulo;
      String autor;
      int paginas;  

      System.out.println("----------------------- \n");
      System.out.println("Título: ");
      titulo = datoIngresado.nextLine();
      System.out.println("Autor: ");
      autor = datoIngresado.nextLine();
      System.out.println("Número de páginas: ");
      paginas = datoIngresado.nextInt();

      acumuladorNumeroLibro++; // Contador de los libros ingresados

      acumuladorTexto += "\n" // Iniciamos con un salto de línea para separar cada ítem ingresado

        +"Número Libro: " + acumuladorNumeroLibro+ "\n"       
        + "Título: " + titulo + "\n" 
        + "Autor: " + autor + "\n" 
        + "Número de páginas: " + paginas+"\n"+"\n"; 

      datoIngresado.nextLine();  // Esto consume el salto de línea pendiente después de nextInt()

      System.out.println("¿Registrar Otro Libro: Si / No? \n");
      respuesta = datoIngresado.nextLine();
}
    while(respuesta.equalsIgnoreCase("si"));  // 

    System.out.println(acumuladorTexto);
    System.out.println("----- GRACIAS POR SU VISITA A LIBRESERGIO -----");
  }
}








