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
public class Extra6 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        int v,c=0;
        double s=0,t=0;
        Scanner l = new Scanner (System.in);
        System.out.println("Tamaño de muestra N personas");
        v=l.nextInt();
        System.out.println("");
        double [] vector = new double [v];
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(Math.random()*1.2+1);
            System.out.println(vector[i]);
        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            t=t+vector[i];
            if (vector[i]<1.60) {
                c++;
                s=s+vector[i];
            }
        }
        System.out.println("El promedio de altura de las "+v+" personas es: "+t/v);
        System.out.println(+c+" Personas estan por debajo de una altura de 1.60 m y la "
                + " altura promedio es de : "+s/c);
    }
    
}
