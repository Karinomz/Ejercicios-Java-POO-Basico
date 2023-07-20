/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import servicios.ServiciosEjercicio9;

/**
 *
 * @author never
 */
public class JavaPOO9 {
    public static void main(String[] args) {
        ServiciosEjercicio9 servicios = new ServiciosEjercicio9();
        servicios.crearAritmetica();
        double mayor = servicios.devolverMayor();
        System.out.println("El mayor valor es: " + mayor);

        double potencia = servicios.calcularPotencia();
        System.out.println("La potencia del mayor valor elevado al menor valor es: " + potencia);

        double raiz = servicios.calculaRaiz();
        System.out.println("La raíz cuadrada del menor valor es: " + raiz);
    }
}

