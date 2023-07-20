/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author never
 */
public class JavaPOO10 {
      public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializar arregloA con números aleatorios
        inicializarArreglo(arregloA);

        System.out.println("Arreglo A original:");
        mostrarArreglo(arregloA);
        // Ordenar arregloA de menor a mayor
        Arrays.sort(arregloA);

        System.out.println("\nArreglo A ordenado:");
        mostrarArreglo(arregloA);

        // Copiar los primeros 10 elementos ordenados a arregloB
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        // Rellenar los últimos 10 elementos de arregloB con el valor 0.5
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        System.out.println("\nArreglo B combinado:");
        mostrarArreglo(arregloB);
    }

    // Método para inicializar el arreglo con números aleatorios
    public static void inicializarArreglo(double[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(50) + 1; // Números aleatorios entre 1 y 50
        }
    }

    // Método para mostrar el contenido del arreglo
    public static void mostrarArreglo(double[] arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
