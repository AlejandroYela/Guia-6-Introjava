/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int termino;
        System.out.println("Ingresar término: ");
        termino = leer.nextInt();
        System.out.println(Fibonacci(termino));
    }

    public static String Fibonacci(int t) {
        String texto = "";
        int[] vector = new int[t];
        int m = 1, n = 1, k;
        for (int i = 0; i < t; i++) {

            if (i == 0) {
                vector[i] = m;
                texto += String.valueOf(vector[i]);
            } else {
                k = m + n;
                m = n;
                n = k;
                vector[i] = m;
                texto += " ," + String.valueOf(vector[i]);
            }
        }
        return texto;
    }

}


