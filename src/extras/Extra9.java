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
public class Extra9 {

    /**
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo,
     * y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13: 50
     * – 13 = 37 una resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13
     * = 11 tres restas realizadas dado que 11 es menor que 13, entonces: el
     * residuo es 11 y el cociente es 3.
     */
    public static void main(String[] args) {
        int a, b, r = 0, c = 0, x;
        Scanner l = new Scanner(System.in);
        System.out.println("Dividendo");
        a = l.nextInt();
        System.out.println("");
        System.out.println("Divisor");
        b = l.nextInt();
        System.out.println("");
        x = a;
        
        do {
            r = x - b;
            x = r;
            c++;
        } while (x >= b);

        System.out.println("El cociente es " + c);
        System.out.println("El residuo es " + r);
    }

}
