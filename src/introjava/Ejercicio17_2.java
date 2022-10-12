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
public class Ejercicio17_2 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int v, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        System.out.println("Ingrese el tamaño del vector:");
        v = l.nextInt();

        int[] vector = new int[v];

        for (int i = 0; i < v; i++) {
            vector[i] = (int) (Math.random() * 15000);
            System.out.println(vector[i]);
        }

        for (int i = 0; i < v; i++) {
            if (vector[i] < 10) {
                c1++;
            } else if (vector[i] < 100) {
                c2++;
            } else if (vector[i] < 1000) {
                c3++;
            } else if (vector[i] < 10000) {
                c4++;
            } else {
                c5++;
            }
        }
        System.out.println("Hay "+c1+" numeros de 1 cifra");
        System.out.println("Hay "+c2+" numeros de 2 cifra");
        System.out.println("Hay "+c3+" numeros de 3 cifra");
        System.out.println("Hay "+c4+" numeros de 4 cifra");
        System.out.println("Hay "+c5+" numeros de 5 cifra");
    }

}

