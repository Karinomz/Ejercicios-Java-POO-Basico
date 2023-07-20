/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Rectangulo;

/**
 *
 * @author never
 */
public class ServiciosEjercicio4 {
    Scanner scanner = new Scanner(System.in);
    private Rectangulo rectangulo;
    
    public void crearRectangulo(){
        System.out.println("Ingrese el tamaño de la base: ");
        int base1=scanner.nextInt();
        System.out.println("Ingrese el tamaño de la altura:");
        int altura2=scanner.nextInt();
        
        rectangulo= new Rectangulo(base1,altura2);
    }
    //Superficie = base * altura / Perímetro = (base + altura) * 2.
    
    public int calcularSuperficie(){
        int superficie = rectangulo.getBase()*rectangulo.getAltura();
    return superficie;
    }
    
    public int calcularPerimetro(){
        int perimetro = (rectangulo.getBase()+rectangulo.getAltura())*2;
    return perimetro;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
    }
    
}
