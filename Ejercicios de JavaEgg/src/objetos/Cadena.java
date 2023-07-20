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
public class Cadena {
   private String frase;
    private int longitud;

    // Constructor por defecto
    public Cadena() {}

    // Constructor con todos los atributos como parámetro
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Métodos getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}
