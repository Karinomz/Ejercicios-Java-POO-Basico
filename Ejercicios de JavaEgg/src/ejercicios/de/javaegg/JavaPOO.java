/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import objetos.LibroEjercicio1;
import servicios.ServiciosEjercicio1;




/**
 *
 * @author never
 */
public class JavaPOO {
    public static void main(String[] args) {
        ServiciosEjercicio1 se = new ServiciosEjercicio1();
        LibroEjercicio1 l1 = se.altaLibro();
        se.mostrarDatos(l1);
        
    }   
}
