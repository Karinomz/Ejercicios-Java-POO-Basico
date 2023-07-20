/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class JavaPOO11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        
        
        // Crear la fecha ingresada por el usuario
        Date fechaIngresada = new Date(anio-1900, mes - 1, dia);

        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Calcular la diferencia de años entre ambas fechas
        int aniosDiferencia = calcularAniosDiferencia(fechaIngresada, fechaActual);

        // Mostrar la fecha ingresada por el usuario
        System.out.println("Fecha ingresada: " + fechaIngresada);

        // Mostrar la fecha actual
        System.out.println("Fecha actual: " + fechaActual);

        // Mostrar la diferencia de años
        System.out.println("Años de diferencia: " + aniosDiferencia);

        scanner.close();
    }

    // Método para calcular la diferencia de años entre dos fechas
    public static int calcularAniosDiferencia(Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear() + 1900;
        int anio2 = fecha2.getYear() + 1900;
        return anio2 - anio1;
    }
    
}