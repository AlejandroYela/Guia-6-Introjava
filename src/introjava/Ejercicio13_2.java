/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Rectangulo");
        int t;
        t = leer.nextInt();

        for (int i = 0; i < t; i++) {
            if (i != 0 && i != t - 1) {
                for (int j = 0; j < t; j++) {
                    if (j != 0 && j != t - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            } else {
                for (int j = 0; j < t; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            
        }
    }
}
