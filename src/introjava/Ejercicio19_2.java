/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author 2021
 */
public class Ejercicio19_2 {

    /**
     * Realice un programa que compruebe si una matriz dada es anti simétrica.
     * Se dice que una matriz A es anti simétrica cuando ésta es igual a su
     * propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica
     * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
     * obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int[][] matriz = {{0,2,-4}, {-2,0,2}, {4,-2,0}};
        int[][] matrizb = new int[3][3];
        int c = 0;

        System.out.println("Matriz A");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz T");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j] = matriz[j][i];
                System.out.print("  " + matrizb[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -1 * matrizb[i][j]) {
                    c++;
                }
            }
        }
        if (c == 9) {
            System.out.println("La matriz A es igual a la matriz -AT, es decir Antisimetrica");

        } else {
            System.out.println("No es Antisimetrica");
        }
    }

}
