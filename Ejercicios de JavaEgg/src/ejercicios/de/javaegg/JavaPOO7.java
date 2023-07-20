/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import objetos.Persona;
import servicios.ServiciosEjercicio7;

/**
 *
 * @author never
 */
public class JavaPOO7 {
    public static void main(String[] args) {
        ServiciosEjercicio7 servicios = new ServiciosEjercicio7();
        Persona persona = servicios.crearPersona();

        int resultadoIMC = servicios.calcularIMC(persona);
        String mensajeIMC;
        switch (resultadoIMC) {
            case -1:
                mensajeIMC = "Por debajo del peso ideal";
                break;
            case 0:
                mensajeIMC = "Peso ideal";
                break;
            default:
                mensajeIMC = "Sobrepeso";
                break;
        }
        System.out.println("IMC: " + mensajeIMC);

        boolean esMayorDeEdad = servicios.esMayorDeEdad(persona);
        String mensajeMayorDeEdad = esMayorDeEdad ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(mensajeMayorDeEdad);

        
         
        
    }

}