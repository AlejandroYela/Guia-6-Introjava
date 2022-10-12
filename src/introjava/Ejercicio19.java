package introjava;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        int[][] matriza = {{0, 2, -4}, {-2, 0, 2}, {4, -2, 0}};
        int[][] matrizb = new int[3][3];
        int cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j] = matriza[j][i];
            }
        }
        
        System.out.println("Normal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriza[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrizb[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizb[i][j] == ((-1) * matriza[i][j])) {
                    cont++;
                }
            }
        }
        System.out.println("contador: "+cont);
    }
}
