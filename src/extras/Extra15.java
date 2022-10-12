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
public class Extra15 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        float a, b;
        int v = 0;
        Scanner l = new Scanner(System.in);
        System.out.println("Numero a:");
        a = l.nextFloat();
        System.out.println("Numero b:");
        b = l.nextFloat();
        System.out.println("");
        System.out.println("Eliga la funcion a ejecutar:");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");
        System.out.println("-----------------------------");
        do {
            v = l.nextInt();
        } while (v < 0 || v > 4);
        switch (v) {
            case 1:
                System.out.println(suma(a, b));
                break;
            case 2:
                System.out.println(resta(a, b));

                break;
            case 3:
                System.out.println(multiplicacion(a, b));

                break;
            case 4:
                System.out.println(division(a, b));

                break;
        }
    }

    public static float suma(float a, float b) {
        float s = 0;
        s = a + b;
        return s;
    }

    public static float resta(float a, float b) {
        float r = 0;
        r = a - b;
        return r;
    }

    public static float multiplicacion(float a, float b) {
        float m = 0;
        m = a * b;
        return m;
    }

    public static float division(float a, float b) {
        float d = 1;
        d = a / b;
        return d;
    }
}
