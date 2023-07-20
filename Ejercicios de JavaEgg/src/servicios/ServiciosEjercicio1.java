/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.LibroEjercicio1;

/**
 *
 * @author never
 */
public class ServiciosEjercicio1 {
    public LibroEjercicio1 altaLibro(){
        LibroEjercicio1 l1 = new LibroEjercicio1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro: ");
        l1.setTitulo(scan.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        l1.setAutor(scan.nextLine());
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        l1.setNdPag(scan.nextInt());
        System.out.println("Ingrese el numero ISBN: ");
        l1.setISBN(scan.nextInt());
        
        return l1;
    }
    
    public void mostrarDatos(LibroEjercicio1 l1){
        System.out.println("");
        System.out.print("El titulo del libro es: "+l1.getTitulo());
        System.out.println("");
        System.out.print("EL autor del libro es: "+l1.getAutor());
        System.out.println("");
        System.out.print("La cantidad de paginas del libro es: "+l1.getNdPag());
        System.out.println("");
        System.out.print("El codigo ISBN es: "+l1.getISBN());
        System.out.println("");
        
        
    }
    
    
    
    
}
