/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Circunferencia;

/**
 *
 * @author never
 */
public class ServiciosEjercicio2 {
    Scanner scan = new Scanner(System.in);
    Circunferencia c1 = new Circunferencia();
    public Circunferencia circu(){
    
        System.out.print("Por favor, ingrese el radio: ");
        c1.setRadio(5.0);
        
    return c1;
    }
    
    public Circunferencia calcular(){
        c1.setArea(Math.PI*Math.pow(c1.getRadio(), 2));
        System.out.print("El Area es = "+c1.getArea());
        System.out.println("");
        c1.setPerimetro(Math.PI*2*c1.getRadio());
        System.out.print("El Perimetro es = "+c1.getPerimetro());
        System.out.println("");
    return c1;  
    }
   
    
    
    
    
    
    
    
}
