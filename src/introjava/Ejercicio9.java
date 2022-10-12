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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String letra;

        System.out.println("Ingrese una frase");
        frase = leer.next();
        letra=frase.substring(0, 2);


        if (frase.substring(0, 1).equals("A")) {

            System.out.println("CORRECTO");

        } else {

            System.out.println("INCORRECTO");
        }
    }

}

