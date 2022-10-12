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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      int num1;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("El doble del numero ingresado es " + (num1 * 2));
        System.out.println("El triple del numero ingresado es " + (num1 * 3));
        System.out.println("La raiz del numero ingresado es " + (Math.sqrt(num1)));
    }
    
}

