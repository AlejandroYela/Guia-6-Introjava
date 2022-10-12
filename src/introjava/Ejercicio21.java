package introjava;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int[][] matrizG = new int[10][10];
        int[][] matrizC = new int[3][3];
        int cont = 0;
        Random r = new Random();
        Scanner l = new Scanner(System.in);
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizG[i][j] = r.nextInt(5);
                System.out.print(" " + matrizG[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("ingrese la matriz pequeña");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = l.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrizC[i][j] + " ");

            }
            System.out.println("");
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (matrizG[i][j] == matrizC[0][0]) {
                    cont = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int m = 0; m < 3; m++) {

                            if (matrizG[i + k][j + m] == matrizC[k][m]) {
                                cont++;
                            }
                        }

                    }
                    if (cont == 9) {
                        encontrado = true;
                        System.out.println("encontrada una coincidencia en fila: " + (i + 1) + " columna: " + (j + 1));
                    }
                }

            }
        }
        if (!encontrado) {
            System.out.println("no se encontraron coincidencias");
        }

    }

}
