/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetos.Cuenta;

/**
 *
 * @author never
 */
public class ServiciosEjercicio5 {
    private Cuenta cuenta;
    Scanner scanner = new Scanner(System.in);
    
    public void crearCuenta(){
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el DNI del cliente: ");
        long DNI = scanner.nextLong();

        System.out.print("Ingrese el saldo actual: ");
        double saldo = scanner.nextDouble();
        
        cuenta = new Cuenta(numeroCuenta,DNI,saldo);
        System.out.println("Cuenta creada con éxito.");
    }
    
    public void ingresar(double ingreso){
        System.out.print("Que cantidad de dinero desea ingresar?");
        ingreso=scanner.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo()+ingreso);
        System.out.println("ingreso = " + ingreso);
        System.out.println("Su saldo actual es= "+cuenta.getSaldo());
    }
    
    public void retirar(double retirar){
        System.out.print("Que cantidad de dinero desea retirar?");
        retirar=scanner.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo()-retirar);
        System.out.println("Su saldo actual es= "+cuenta.getSaldo());
    }
    
    public void extraccionRapida(){
        System.out.print("Su saldo actual es $"+cuenta.getSaldo()+"Ingrese la cantidad a retirar (máximo 20% del saldo): ");
        double limite = cuenta.getSaldo() * 0.2;
        double retiro = scanner.nextDouble();

        if (retiro <= limite) {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
            System.out.println("Extracción rápida realizada con éxito.");
        } else {
            System.out.println("No puede retirar más del 20% del saldo.");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es = $"+cuenta.getSaldo());
    }
    
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDNI());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
  
}
