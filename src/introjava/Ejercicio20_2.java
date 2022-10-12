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
public class Ejercicio20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, t, e;

        Scanner l = new Scanner(System.in);
        System.out.println("Tamaño de la matriz: ");
        n = l.nextInt();
        m = n;
        t = m + n + 2;
        int[][] a = new int[n][m];
        int[] v = new int[t];
        boolean b = true;
        e = m * n;
        System.out.println("");
        System.out.println("Ingrese los " + e + " valores de la matriz: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = l.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int k = 0; k < t; k++) {
            v[k] = 0;
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                v[k] = v[k] + a[i][j];
                v[k + n] = v[k + n] + a[j][i];
            }
            k = k + 1;
        }
        System.out.println("");
        System.out.println("La suma de las " + n + " filas y " + m + " columnas de la matriz " + n + "x" + m + " se ve representada en el vector de tamaño: ");
        System.out.println("");
        System.out.print("Vector de tamaño t = ");

        for (int i = 0; i < (t - 2); i++) {
            System.out.print(v[i] + ",");
        }
        for (int i = 0; i < n; i++) {
            v[t - 2] = v[t - 2] + a[i][i];
            v[t - 1] = v[t - 1] + a[i][(n - 1) - i];
        }
        System.out.print(v[t - 2] + ",");
        System.out.println(v[t - 1]);
        System.out.println("");

       k=0;

        for (int i = 0; i < (t - 1); i++) {

            if (v[i] == v[i + 1]) {

                k = k + 1;
            }
        }

        System.out.println("");
        if (k == (m+n+1)) {
            System.out.println("La matriz es mágica");

        } else {
            System.out.println("La matriz no es mágica");
        }
        System.out.println("");
    }

}
