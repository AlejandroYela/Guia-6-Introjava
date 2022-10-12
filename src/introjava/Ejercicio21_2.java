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
public class Ejercicio21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]m1=new int [10][10];
        int[][]m2=new int [3][3];
        int c;
        Random r= new Random();
        Scanner l= new Scanner(System.in);
        boolean b=false;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m1[i][j]=r.nextInt(2);
                System.out.print(" [ "+m1[i][j]+" ] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Digite la matriz 3x3");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
                m2[i][j]=l.nextInt();
            }            
        }
        System.out.println("");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
                System.out.print(" [ "+m2[i][j]+" ] ");
            }
            System.out.println("");
        }
         System.out.println("");
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 8; j++) {
                 if (m1[i][j]==m2[0][0]) {
                     c=0;
                     for (int k = 0; k < 3; k++) {
                         for (int m = 0; m < 3; m++) {
                             if (m1[i+k][j+m]==m2[k][m]) {
                                 c++;
                             }
                         }
                     }
                     if (c==9) {
                         b=true;
                         System.out.println("Se encontró una coincidencia en la fila ["+(i+1)+"] columna ["+(j+1)+"] ");  
                     }
                 }
             }
        }
         if (!b) {
             System.out.println("No se encontraron coincidencias en la matriz 10x10");
        }
    }
    
}
