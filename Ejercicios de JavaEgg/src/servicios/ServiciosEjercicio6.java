package servicios;

import java.util.Scanner;
import objetos.Cafetera;

public class ServiciosEjercicio6 {
    Scanner scanner = new Scanner(System.in);
    private Cafetera cafetera;
    
    public void servirTaza (){
        int capacidadMaxima;
        int cantidadActual;
         
        do {
            System.out.print("Ingrese el tamaño de la taza: ");
            capacidadMaxima = scanner.nextInt();

            System.out.print("Ingrese con la cantidad que quiere que sea llenado: ");
            cantidadActual = scanner.nextInt();
            System.out.println("");
         
            if (cantidadActual<=capacidadMaxima) {
                cafetera = new Cafetera(capacidadMaxima,cantidadActual);
                System.out.println("cantidadActual = " + cantidadActual+" ml");
                System.out.println("capacidadMaxima = " + capacidadMaxima+" ml");  
            }else{
                System.out.println("No puedes llenar una taza mas haya de su capacidad");
                System.out.println("");
            }
            
        } while (cantidadActual>capacidadMaxima);
    }
    
    public void llenarCafetera(){
       if(cafetera != null){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La cafetera se ha llenado completamente.");
            System.out.println("capacidad Maxima = " +cafetera.getCapacidadMaxima()+" ml");
            System.out.println("cantidad Actual = "+cafetera.getCantidadActual()+" ml");
       }else{
           System.out.println("No se ha servido ninguna taza. No se puede llenar la cafetera.");
       }
    }
    
    public void vaciarCafetera(){
       if(cafetera != null){
            cafetera.setCantidadActual(0);
            System.out.println("La cafetera se ha vaciado completamente.");
            System.out.println("cantidad Actual = "+cafetera.getCantidadActual()+" ml");
       }else{
            System.out.println("No se ha servido ninguna taza. No se puede llenar la cafetera.");
       }
    }
    public void agregarCafe() {
        if(cafetera != null){
            System.out.print("Ingrese la cantidad de café a agregar: ");
            int cantidad = scanner.nextInt();

            if (cantidad + cafetera.getCantidadActual() <= cafetera.getCapacidadMaxima()) {
                cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
                System.out.println("Se agregó café correctamente.");
                System.out.println("cantidad Actual = " + cafetera.getCantidadActual()+" ml");
            } else {
                cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
                System.out.println("No se puede agregar más café. La cafetera está llena.");
                System.out.println("cantidad Actual = " + cafetera.getCantidadActual()+" ml");
            }
        }else{
            System.out.println("No se ha servido ninguna taza. No se puede llenar la cafetera.");
       }
    }  
}  