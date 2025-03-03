package projects;

import java.util.Scanner;

public class Ejercicio7IMC {
    
    //Método único que se ejecutará en el main
    //Declaración de variables
        int peso;
        double altura;
        double imc;
        String categoria;
   
    
    public void correrEjercicio7(){
        
        //Creamos objeto Scanner
        
        Scanner datoIngresado = new Scanner(System.in);   
        
        //Ingreso de datos
        
        System.out.println("Ingrese su peso: \n");        
        peso = datoIngresado.nextInt();
        
        System.out.println("Ingrese su altura: \n");        
        altura  = datoIngresado.nextInt();  
        
        // Procesar datos para calcular el IMC
        
        imc = (peso/altura);
        
        /*
        rango1 = (imc<18.5); //bajo peso
        rango2 = (imc >= 18.5 && imc <= 24.9); // peso normal
        rango3 = (imc > 24.9 && imc <= 29.9); //sobrepeso
        rango4 = (imc > 29.9 ); //Obesidad 
        */
        
        categoria = 
                (imc<18.5)? "Bajo peso":
                (imc >= 18.5 && imc <= 24.9) ? "Peso normal":
                (imc > 24.9 && imc <= 29.9) ? "Sobrepeso": "Obesidad";
        

        
        switch(categoria){
            case "Bajo peso":
                System.out.print("Bajo peso. ");
                break;
            case "Peso normal":
                System.out.print("Peso normal. ");    
                break;
            case "Sobrepeso":
                System.out.print("Sobrepeso. ");    
                break;
            case "Obesidad":
                System.out.print("Obesidad. ");
                break;
        }
        datoIngresado.close();
    } 
}
