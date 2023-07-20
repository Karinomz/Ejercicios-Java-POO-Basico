/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.javaegg;

import java.util.Scanner;

/**
 *
 * @author never
 */
public class ejercicio2 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      
      int num;
        int[] vector = new int[100];
        num = 100;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector [" + i + "] = ");
            vector[i] = num;
            System.out.println(vector[i]);
            num = num - 1;
        }
      
      
      
      
      
      
      
      
      
      /**int num1,aux,num2,opinion,suma,resta,multi,divi;

      
     do{ 
   
          System.out.println(" ");
          
          System.out.println("MENU");
          System.out.println("1. Sumar ");
          System.out.println("2. Restar ");
          System.out.println("3. Multiplicar ");
          System.out.println("4. Dividir ");
          System.out.println("5. Salir ");
         
          System.out.println(" ");
          
          System.out.print("Por favor, escoja una opcion: ");
          opinion=leer.nextInt();
    
 
          
            if (opinion>=1 && opinion<=4){ 
                
                System.out.print("Por favor, ingrese el primer numero: ");
                num1=leer.nextInt();
                System.out.print("Por favor, ingrese el segundo numero: ");
                num2=leer.nextInt();
          
            
                    if(opinion==1){
                        suma=num1+num2;
                        System.out.println("La suma del primer y segundo numero es = " +suma);
                    }
                    
                    if(opinion==2){
                        resta=num1-num2;
                        System.out.println("La resta del primer y segundo numero es = " +resta);
                    }
                  
                    if(opinion==3){
                        multi=num1*num2;
                        System.out.println("La multiplicacion del primer y segundo numero es = " +multi);
                    }
                  
                    if(opinion==4){
                        divi=num1/num2;
                        System.out.println("La division del primer y segundo numero es = " +divi);
                    }
                          
             
            } /** if **/
        /**
            if(opinion==5){
                System.out.println("Usted a seleccionado salir del menu.");
            }
            
           
        
        }while (opinion!=5); **/
      
      
      
  }
      /**int num1,aux,num2,i;
        System.out.println("Ingrese un numero: ");
        num2=1;
        aux=0;
        
            do {
            System.out.print("Por favor , ingrese un numero (" +num2+ ") : ");
            num1=scan.nextInt();

            if (num1>0) {
            num1=aux+num1;
            aux=num1;
            num2=num2+1;
            }

            if (num1==0){
                System.out.println("Se capturo el numero cero");
                System.out.println("La suma de todos los numeros es "+aux);
                break;
            }
            
        }while (num2<21);
        
        if (num1>0) {
        System.out.println("La suma de todos los numeros es : " +num1);    
        }
        
        
        
        
        
        
        
        
        
        
        /**if (num1>0) {
            System.out.println("El numero es correcto");
            do {
                
                System.out.print(i+" Ingrese otro numero: ");
                i=++i;
                num1=scan.nextInt();
                num1=aux+num1;
                aux=num1;
                
            } while (num1<=num2);
            
        }else{
            System.out.println("El numero es incorrecto, ingrese numero positivos");
        }
      
      
      
      
      
      
      
      
      
      
      
      
      
        /**do {
        System.out.println("Por favor, ingrese un numero entre 0 y 10 : ");
        num=scan.nextInt();
        
        if (num >=0 && num <=10) {
          System.out.println("El numero a sido ingresado es correcto");  
        }
      } while ( num <0 || num >10);
        
      
      
      
        
        
      
      
      
      
      
      
      
      
      /**
      
      int num1,num2,num3;
        System.out.println("hola, ingrese 3 numeros para saber cual es el mayor:");
        System.out.print("Primer numero: ");
        num1= scan.nextInt();
        System.out.print("Segundo numero: ");
        num2= scan.nextInt();
        System.out.print("Tercer numero: ");
        num3= scan.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println("El primer numero es mas grande de todos : "+num1);
        }if (num2>num1 && num2>num3) {
            System.out.println("El segundo numero es mas grande de todos : "+num2);    
        }if (num3>num1 && num3>num2) {
            System.out.println("El tercer numero es mas grande de todos : "+num3);
        }
      
      
      
      
      
      
      
      /**int opinion;
      System.out.println("Nuestra empresa tiene 4 tipos de bombas para motores");
      System.out.print("Por favor, ingrese del 1 al 4, que tipo de motor que desea consultar : ");
      opinion=scan.nextInt();
      
      if (opinion>=1 && opinion<=4){
          switch(opinion){
              case 1:
                  System.out.println("La bomba de este motor es una bomba de agua");
                  break;
              case 2:
                  System.out.println("La bomba de este motor es una bomba de gasolina");
                  break;
              case 3:
                  System.out.println("La bomba de este motor es una bomba de hormigon");
                  break;
              case 4:
                  System.out.println("La bomba de este motor es una bomba de pasta alimenticia");
                  break;
          }
          
      }else{
         System.out.println("No existe un valor valido p"
                 + "ara tipo de bomba"); 
      }
      **/ 
    }

    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    /**
      System.out.print("Por favor, ingrese la palabra clave : ");
      palabra=scan.next();
      a="a";
      veri=palabra.substring(0,1);
      if (a.equals(veri)){
        System.out.println("La palabra clave es correcta"); 
      }else {
            System.out.println("La palabra clave es incorrecta");         
      } 
    }  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      /**
      
      int num;
      num=palabra.length();
      
        if (num==8) { 
            System.out.println("La palabra clave es correcta");
        }else{
            System.out.println("La palabra clave es incorrecta");         
            } 
      
      
      
      
      
      
      System.out.println("Por favor, ingrese la palabra clave: ");
      palabra= scan.next();
        if ("eureka".equals(palabra.toLowerCase())) {
            System.out.println("La palabra clave es correcta");
        }else{
            System.out.println("La palabra clave es incorrecta");
        }

     
      int num1,num2;
      System.out.println ("Por favor, ingrese el primer numero Aqui");
      num1=leer.nextInt();
      System.out.println ("Por favor, ingrese el segundo numero Aqui");
      num2=leer.nextInt();
      
      
      if (num1 > num2){
        System.out.println ("El primer numero ("+num1+") es mayor al segundo ("+num2+")");          
      }
       if (num2 > num1){
        System.out.println ("El segundo numero ("+num2+") es mayor al primero ("+num1+")");       
      }
      
        if (num1 % 2 == 0) {
            System.out.println(num1+" es un numero par");   
        }else{
            System.out.println(num1+" es un numero impar");
        }
        
        if (num2 % 2 == 0) {
            System.out.println(num2+" es un numero par");   
        }else{
            System.out.println(num2+" es un numero impar");
        }
        **/
       
       
    

