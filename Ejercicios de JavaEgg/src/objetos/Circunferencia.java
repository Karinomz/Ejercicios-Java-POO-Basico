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
public class Circunferencia {
    private Double radio;
    private Double perimetro;
    private double area;

    public Circunferencia() {
    }

    public Circunferencia(Double radio, Double perimetro, double area) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
    
}
