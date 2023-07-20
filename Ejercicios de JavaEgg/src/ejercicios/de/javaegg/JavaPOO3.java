
package ejercicios.de.javaegg;
import servicios.Servicios;


public class JavaPOO3 {
    public static void main(String[] args) {
    Servicios servicios = new Servicios();
    
        // Llama al método crearOperacion() para pedir al usuario los números
        servicios.crearOperacion();

        // Llama a los métodos de operaciones y muestra los resultados por pantalla
        System.out.println("Suma: " + servicios.sumar());
        System.out.println("Resta: " + servicios.restar());
        System.out.println("Multiplicación: " + servicios.multiplicar());
        System.out.println("División: " + servicios.dividir());
    }
}