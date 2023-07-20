package ejercicios.de.javaegg;

import java.util.Scanner;
import objetos.Cuenta;
import servicios.ServiciosEjercicio5;


public class JavaPOO5 {
    public static void main(String[] args) {
        ServiciosEjercicio5 se = new ServiciosEjercicio5();
        Cuenta cuenta = new Cuenta();
        Scanner scanner = new Scanner(System.in);
        
        se.crearCuenta();
        int opinion;
        do {
            System.out.println(" ");

            System.out.println("MENU");
            System.out.println("1. Ingresar dinero ");
            System.out.println("2. Retirar dinero ");
            System.out.println("3. Extraccion rapida ");
            System.out.println("4. Consultar Saldo ");
            System.out.println("5. Consultar Datos ");
            System.out.println("6. Salir del Menu ");

            System.out.println(" ");

            System.out.println("¿Que accion le gustaria realizar? ");
            opinion=scanner.nextInt();

            switch (opinion) {
              case 1:
                  se.ingresar(0);
                  break;
              case 2:
                  se.retirar(0);
                  break;
              case 3:
                  se.extraccionRapida();
                  break;
              case 4:
                  se.consultarSaldo();
                  break;
              case 5:
                  se.consultarDatos();
                  break;
              case 6:
                  System.out.println("Usted ha seleccionado salir del menú.");
                  break;
              default:
                  System.out.println("Opción inválida.");
                  break;
}
            
        } while (opinion!=6);    
        
    }
}
