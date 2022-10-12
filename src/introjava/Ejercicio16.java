/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class Ejercicio16 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
     *
     * @param args
     */
    public static void main(String[] args) {
        int n, m, cont = 0;

        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        n = l.nextInt();
        int[] vector = new int[n];
        Random numero = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = numero.nextInt(10);
        }
        System.out.println("Valor a buscar en el vector:");
        m = l.nextInt();

        for (int i = 0; i < n; i++) {
            
            if (m == vector[i]) {
                cont++;
            }

        }
        System.out.println("La cantidad de veces que se encuentra " + m + " en el vector es "
                + cont);
    }
}
