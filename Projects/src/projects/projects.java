package projects;

import java.util.Scanner;

public class projects {

    public static void main(String[] args) {
        
        Scanner datoIngresado = new Scanner(System.in);
        
        int opcion;

        do {

            System.out.println("\nSeleccione el número del ejercicio a ejecutar (1-27) o 0 para salir:");
            opcion = datoIngresado.nextInt();

            switch (opcion) {
                case 1:
                    new Ejercicio1AscensorPiso().correrEjercicio1();
                    break;
                case 2:
                    new Ejercicio2AscensorLimitePeso().correrEjercicio2();
                    break;
                case 3:
                    new Ejercicio3SensorTemperatura().correrEjercicio3();
                    break;
                case 4:
                    new Ejercicio4SensorTemperaturaUmbral().correrEjercicio4();
                    break;
                case 5:
                    new Ejercicio5AscensorPisoTemperatura().correrEjercicio5();
                    break;
                case 6:
                    new Ejercicio6TiendaTresProductos().correrEjercicio6();
                    break;
                case 7:
                    new Ejercicio7IMC().correrEjercicio7();
                    break;
                case 8:
                    new Ejercicio8Cine().correrEjercicio8();
                    break;
                case 9:
                    new Ejercicio9Campeonato().correrEjercicio9();
                    break;
                case 10:
                    System.out.println("Este ejercicio se me olvidó, los siento :(");
                    break;  
                case 11:
                    new Ejercicio11CajeroAutomatico().correrEjercicio11();
                    break;
                case 12:
                    new Ejercicio12TiendaLinea().correrEjercicio12();
                    break;
                case 13:
                    new Ejercicio13Impresora().correrEjercicio13();
                    break;
                case 14:
                    new Ejercicio14ViajeCoche().correrEjercicio14();
                    break;
                case 15:
                    new Ejercicio15AdivinaNumero().correrEjercicio15();
                    break;
                case 16:
                    new Ejercicio16Juego1A100().correrEjercicio16();
                    break;
                case 17:
                    new Ejercicio17RegistroBibliotecas().correrEjercicio17();
                    break;
                case 18:
                    new Ejercicio18MenuComidasRapidas().correrEjercicio18();
                    break;
                case 19:
                    new Ejercicio19RangoTemperatura().correrEjercicio19();
                    break;
                case 20:
                    new Ejercicio20ResultadoExamenesAprobado().correrEjercicio20();
                    break;  
                case 21:
                    new Ejercicio21Tareas().correrEjercicio21();
                    break;
                case 22:
                    new Ejercicio22ResumenTotalVentas().correrEjercicio22();
                    break;
                case 23:
                    new Ejercicio23Parqueadero().correrEjercicio23();
                    break;
                case 24:
                    new Ejercicio24TiendaVirtual().correrEjercicio24();
                    break;
                case 25:
                    new Ejercicio25AgendaContactos().correrEjercicio25();
                    break;
                case 26:
                    new Ejercicio26ListaNumeros().correrEjercicio26();
                    break;
                case 27:
                    new Ejercicio27ProcesoTiendaVentas().correrEjercicio27();
                    break;    
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
