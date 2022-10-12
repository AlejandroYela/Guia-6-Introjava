/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.

 * @author Gabriel
 */
public class Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int t=sc.nextInt();
        int[] [] matriz= new int[t][t];
        rellenar( matriz,t);
        imprimir( matriz,t);
    }

    private static void rellenar(int[][] matriz, int t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     for (int i = 0; i < t; i++) {
         for (int j = 0; j < t; j++) {
              matriz[i][j]=(int) (Math.random() * 10);
         }
           
        }
    }

    private static void imprimir(int[][] matriz, int t) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }

    
    
}

    
    

