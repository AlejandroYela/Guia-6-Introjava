/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule la 
        suma de los dos. El programa deberá después mostrar el resultado de la suma*/
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        num2 = leer.nextInt();
        System.out.println("La suma de ambos numero es " + (num1 + num2));
    }
    
}