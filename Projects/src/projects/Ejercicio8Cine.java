package projects;

import java.util.Scanner;

public class Ejercicio8Cine {
    
    public void correrEjercicio8(){        

        try (Scanner datoIngresado = new Scanner(System.in)) {
            //Ingreso edad
            int edad;
            String rango;
            System.out.println("Ingrese su edad: ");
            edad = datoIngresado.nextInt();
            //Recomendar película según edad
            
            //Definir rango según la edad
            
            rango = (edad < 7) ? "1":
                    (edad >= 7 && edad <= 17) ? "2":
                    (edad > 17 && edad <= 30) ? "3": "4";
            
            switch(rango){
                case "1":
                    System.out.println("Se recomiendan películas animadas y educativas aptas "
                            + "para todas las edades. ");
                    break;
                case "2":
                    System.out.println("Se recomiendan películas adecuadas para la familia, "
                            + "como animaciones, aventuras y comedias familiares");
                    break;
                case "3":
                    System.out.println("Se recomiendan películas de acción, drama, comedia y ciencia ficción."
                            + "Personas Mayores");
                    break;
                case "4":
                    System.out.println("Se recomiendan películas clásicas y dramas");
                    break;
            }
        }
    }    
}
