/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import objetos.Rectangulo;
import servicios.ServiciosEjercicio4;

/**
 *
 * @author never
 */
public class JavaPOO4 {
    public static void main(String[] args) {
        ServiciosEjercicio4 se= new ServiciosEjercicio4();
        Rectangulo rectangulo = new Rectangulo();
        se.crearRectangulo();
        
        System.out.println("La superficie es: "+se.calcularSuperficie());
        System.out.println("El perimetro es: "+se.calcularPerimetro());
        se.dibujarRectangulo();
    }
}
