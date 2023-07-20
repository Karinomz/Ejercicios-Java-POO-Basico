/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author never
 */
public class Matematica {
    private double numero1;
    private double numero2;

    // Constructor vacío
    public Matematica() {
    
    }

    // Constructor parametrizado
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos getters y setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
}
