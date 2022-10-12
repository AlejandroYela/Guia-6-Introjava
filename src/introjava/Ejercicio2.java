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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir tu nombre completo:");
        String nombre;
        nombre=leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }
    
}
