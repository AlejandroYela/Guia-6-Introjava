/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 * @author cdb
 */
public class Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, salir = "NO";
        int edad;
        Scanner leer = new Scanner(System.in);
        do {
        System.out.println("Ingrese un nombre");
        nombre = leer.next();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
         datosPersona(nombre, edad);  
            System.out.println("Desea ingresar mas personas? (SI/NO)");
            salir = leer.next();
            salir = salir.toUpperCase();
        } while (!salir.equals("NO"));
    }

    private static void datosPersona(String nombre, int edad) {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        if (edad<18) {
            System.out.println("Es menor de edad");
        }
        else{
            System.out.println("Es mayor de edad");
        }
    }
    
}
