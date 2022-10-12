/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class Extra20 {
    public static void main(String[] args) {
        //  Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
        //  parámetro. Después haremos otra función o procedimiento que imprima el vector.
        
        
        
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        int []vector= new int[t];
        
        
        rellenar(vector,t);
        mostrar(vector,t);
        
        
    }

    private static void rellenar(int[] vector, int t) {
        for (int i = 0; i < t; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }

    private static void mostrar(int[] vector, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
    }
      

}
