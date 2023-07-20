package ejercicios.de.javaegg;

import java.util.Scanner;
import servicios.ServiciosEjercicio6;

public class javaPOO6 {
    public static void main(String[] args) {
    ServiciosEjercicio6 servicios = new ServiciosEjercicio6();
    Scanner scanner = new Scanner(System.in);

        int opcion;
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Servir taza");
            System.out.println("2. Llenar cafetera");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    servicios.servirTaza();
                    System.out.println("");
                    break;
                case 2:
                    servicios.llenarCafetera();
                    System.out.println("");
                    break;
                case 3:
                    servicios.vaciarCafetera();
                    System.out.println("");
                    break;
                case 4:
                    servicios.agregarCafe();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    System.out.println("");
                    break;
            }
        } while (opcion != 5);
    }     
}
