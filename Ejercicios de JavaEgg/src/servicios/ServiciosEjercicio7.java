/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Persona;

/**
 *
 * @author never
 */
public class ServiciosEjercicio7 {
    private Persona persona;
    Scanner scanner = new Scanner(System.in);
    
    /**
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura
     **/
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre= scanner.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad=scanner.nextInt();
        
        char sexo;
        do {
            System.out.println("Ingrese el sexo ('H' para hombre, 'M' para mujer, 'O' para otro): ");
            sexo = scanner.next().toUpperCase().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.println("Ingrese el peso: ");
        double peso=scanner.nextDouble();
        System.out.println("Ingrese el altura en cm: ");
        double altura=scanner.nextDouble();
        
    return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona persona) {
        
        double imc = persona.getPeso() / ((persona.getAltura()*persona.getAltura()))*10000;
        System.out.println("Tu resultado IMC es = " + imc);
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    
        
    }
    
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
    
}
