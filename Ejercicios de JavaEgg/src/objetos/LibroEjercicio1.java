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
public class LibroEjercicio1 {
    private Integer ISBN;
    private String titulo;
    private String autor;
    private Integer NdPag;

    public LibroEjercicio1() {
    }

    public LibroEjercicio1(Integer ISBN, String titulo, String autor, Integer NdPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NdPag = NdPag;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNdPag() {
        return NdPag;
    }

    public void setNdPag(Integer NdPag) {
        this.NdPag = NdPag;
    }

    @Override
    public String toString() {
        return "LibroEjercicio1{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", NdPag=" + NdPag + '}';
    }
    
    
    
    
    
}
