/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import objetos.Matematica;

/**
 *
 * @author never
 */
public class ServiciosEjercicio9 {
    private Matematica matematica;
    
    public Matematica crearAritmetica(){
        double numero1 = Math.random() * 100;
        System.out.println("numero 1 = " + numero1);
        double numero2 = Math.random() * 100;
        System.out.println("numero 2 = " + numero2);

        matematica = new Matematica(numero1, numero2);
        return matematica;
    }

    public double devolverMayor() {
        double mayor = Math.max(matematica.getNumero1(), matematica.getNumero2());
        return mayor;
    }

    public double calcularPotencia() {
    double mayor = devolverMayor();
    double menor = Math.min(matematica.getNumero1(), matematica.getNumero2());

    return Math.pow(mayor, menor);
}

    public double calculaRaiz() {
    double menor = Math.min(matematica.getNumero1(), matematica.getNumero2());
    System.out.println("menor = " + menor);
    double absoluto = Math.abs(menor);
    System.out.println("absoluto = " + absoluto);
    return Math.sqrt(absoluto);
}
}
