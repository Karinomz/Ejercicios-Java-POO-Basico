/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import java.util.Scanner;
import servicios.ServiciosEjercicio8;

/**
 *
 * @author never
 */
public class JavaPOO8 {
    public static void main(String[] args) {
        ServiciosEjercicio8 se = new ServiciosEjercicio8();
        se.pedirFrase();
        se.mostrarVocales();
        se.invertirFrase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un carácter para contar las repeticiones: ");
        String letra = scanner.nextLine();
        se.vecesRepetido(letra);

        System.out.print("Ingrese una nueva frase para comparar la longitud: ");
        String nuevaFrase = scanner.nextLine();
        se.compararLongitud(nuevaFrase);

        System.out.print("Ingrese una nueva frase para unirla: ");
        nuevaFrase = scanner.nextLine();
        se.unirFrases(nuevaFrase);

        System.out.print("Ingrese un carácter para reemplazar las letras 'a': ");
        letra = scanner.nextLine();
        se.reemplazar(letra);

        System.out.print("Ingrese un carácter para comprobar si está contenido en la frase: ");
        letra = scanner.nextLine();
        se.contiene(letra);
    }
}
    
    
