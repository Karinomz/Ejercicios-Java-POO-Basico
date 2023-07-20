/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Cadena;

/**
 *
 * @author never
 */
public class ServiciosEjercicio8 {
    private Cadena cadena;
    Scanner scanner = new Scanner(System.in);
    
    public void pedirFrase() {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        cadena = new Cadena(frase);
    }
    
    public void mostrarVocales() {
        int count = 0;
        String vocales = "AEIOUaeiou";
        for (char c : cadena.getFrase().toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Cantidad de vocales en la frase: " + count);
    }
    
    public void vecesRepetido(String letra) {
        int count = 0;
        for (char c : cadena.getFrase().toCharArray()) {
            if (String.valueOf(c).equalsIgnoreCase(letra)) {
                count++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + count + " veces.");
    }
    
    public void compararLongitud(String frase) {
        Cadena nuevaCadena = new Cadena(frase);
        if (cadena.getLongitud() == nuevaCadena.getLongitud()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases tienen distinta longitud.");
        }
    }

    // Método para unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario
    public void unirFrases(String frase) {
        cadena.setFrase(cadena.getFrase() + " " + frase);
        System.out.println("Frase resultante: " + cadena.getFrase());
    }

    // Método para reemplazar todas las letras "a" en la frase por un carácter seleccionado por el usuario
    public void reemplazar(String letra) {
        cadena.setFrase(cadena.getFrase().replace("a", letra));
        System.out.println("Frase resultante: " + cadena.getFrase());
    }

    // Método para comprobar si la frase contiene un carácter específico
    public void contiene(String letra) {
        if (cadena.getFrase().contains(letra)) {
            System.out.println("La frase contiene el carácter '" + letra + "'.");
        } else {
            System.out.println("La frase no contiene el carácter '" + letra + "'.");
        }
    }
      public void invertirFrase() {
        StringBuilder reversed = new StringBuilder(cadena.getFrase());
        System.out.println("Frase invertida: " + reversed.reverse());
    }
}
