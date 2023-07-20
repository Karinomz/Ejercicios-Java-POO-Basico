/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import java.util.Scanner;

/**
 *
 * @author never
 */
public class EjerciciosDeJavaEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 , num2 , grados, farh;
        System.out.println("Diga un numero: ");
        num1=scan.nextInt();
        System.out.println("Diga otro numero: ");
        num2=scan.nextInt();
        System.out.println("La suma de los dos numeros es = "+(num1+num2));
        grados= num1+num2;
        
        System.out.println("Por favor, escribir su nombre: ");
        String name= scan.nextLine();
        
        System.out.println("Su nombre es " +name);
        System.out.println("En minuscula: "+name.toLowerCase());
        System.out.println("En mayusculas: "+name.toUpperCase());
        
        farh= 32+(9*grados/5);
        
        System.out.println(grados+" es igual a "+farh+" Fahrenheit");
        
        
        
        
                
    }
    
}
