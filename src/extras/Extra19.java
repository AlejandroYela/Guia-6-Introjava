/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).

        Scanner leer = new Scanner(System.in);
        int num, vector1[], vector2[];
        boolean flag;
        System.out.println("Ingrese tamaño de vector");
        num = leer.nextInt();
        vector1 = new int[num];
        vector2 = new int[num];

        for (int i = 0; i < num; i++) {
            vector1[i] = (int) (Math.random() * 2);
            System.out.print("Vector 1= " + "[" + vector1[i] + "]" );
            System.out.println("");

        }
        System.out.println("");

        for (int i = 0; i < num; i++) {

            vector2[i] = (int) (Math.random() * 2);
            System.out.print("");
            System.out.println("Vector 2= " + "[" + vector2[i] + "]");
        }

        flag = comparacion(vector1, vector2, num);
        System.out.println("Los vectores son iguales? " + flag);

    }

    private static boolean comparacion(int[] vector1, int[] vector2, int num) {
        int con = 0;
        for (int i = 0; i < num; i++) {
            if (vector1[i] == vector2[i]) {
                con++;

            } 
                  }
        if (con == num) {
            return true;
        } else {
            return false;
        }
    }
}
