/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Operaciones;


/**
 *
 * @author never
 */
public class Servicios {
    Scanner scanner = new Scanner(System.in);
    private Operaciones operacion;

    // Método para crearOperacion(): pide al usuario los dos números y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        operacion = new Operaciones(numero1, numero2);
    }

    // Método sumar(): calcula la suma de los números y devuelve el resultado a la clase main
    public int sumar() {
        return operacion.getNumero1() + operacion.getNumero2();
    }

    // Método restar(): calcula la resta de los números y devuelve el resultado a la clase main
    public int restar() {
        return operacion.getNumero1() - operacion.getNumero2();
    }

    // Método multiplicar(): valida que no se haga una multiplicación por cero y devuelve el resultado a la clase main
    public int multiplicar() {
        if (operacion.getNumero2() == 0) {
            System.out.println("Error: No se puede multiplicar por cero");
            return 0;
        } else {
            return operacion.getNumero1() * operacion.getNumero2();
        }
    }

    // Método dividir(): valida que no se haga una división por cero y devuelve el resultado a la clase main
    public int dividir() {
        if (operacion.getNumero2() == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return 0;
        } else {
            return operacion.getNumero1() / operacion.getNumero2();
        }
    }
        
}
