/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/ 
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   // .useDelimiter("\n")
    int edad=0;
    String nombre="", op="";
        System.out.println("Hola, de quien quieres determinar si es mayor o menor de edad?");
   
        
        do {
            System.out.print ("Nombre: ");
            nombre = leer.next();
            System.out.print("Edad: ");
            edad = leer.nextInt();
                 
            
       boolean determinar= deteredad (edad, nombre); 
        if (determinar) {
            System.out.println( nombre + " de " + edad + " años es mayor de edad.");
        } else {
            System.out.println( nombre + " de " + edad + " años es menor de edad.");
        }
       
        do {
          System.out.print("Queres continuar con la determinacion? (SI/NO)" );
        op= leer.next().toUpperCase();
          
        } while (!op.equals("SI") && !op.equals("NO"));      
        } while (op.equals("SI")); 
        System.out.println("Nos vemos en Disney!!!");
        }

    public static boolean deteredad (int edad, String nombre){
       boolean determinar=false;
//     Scanner leer = new Scanner(System.in).useDelimiter("\n");
//         System.out.print ("Nombre: ");
//            nombre = leer.next();
//            System.out.print("Edad: ");
//            edad = leer.nextInt();
       
        if (edad>=18) {
            determinar=true;
        }else {
            determinar=false;
        }
     return determinar;   
    }
    
    
}



