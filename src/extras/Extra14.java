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
public class Extra14 {

    /**
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        int n,m=0,c=0;
double p;        
        Scanner l = new Scanner (System.in);
        System.out.println("Cantidad de familias a evaluar:");
        n=l.nextInt();
        System.out.println("");
        int [] vector = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Numero de hijos para familia N° "+(i+1));
            vector [i]=l.nextInt();
            m=m+vector[i];
            c++;
        }
        p=m/c;
        System.out.println("La cantidad de familias evaluadas es:"+c);
        System.out.println("El promedio de hijos por familia es de "+p);
    }
    
}
