/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class Extra7 {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        int s=0,c=0,n,max=0, min;
        double p;
        
        Scanner l=new Scanner (System.in);
        System.out.println("Tamaño de los n valores a ingresar:");
        n=l.nextInt();
        
               
        int[] vector=new int [n];
        System.out.println("Ingrese los "+n+" valores:");
        for (int i = 0; i < vector.length; i++) {
           vector[i]=l.nextInt();
        }
        min=vector[0];
        for (int i = 0; i < vector.length; i++) {
            s=s+vector[i];
            
            while (min>vector[i]) {
                min=vector[i];
            }
            while (vector[i]>max) {
                max=vector[i];
            }
            
        }
        p=s/n;
        System.out.println("El valor maximo es: "+max);
        System.out.println("El valor minimo es: "+min);
        System.out.println("El valor promedio es: "+p);
    }
    
}
