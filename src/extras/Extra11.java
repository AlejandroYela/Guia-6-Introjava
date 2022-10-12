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
public class Extra11 {

    /**
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
     * matemáticamente utilizando el operador de división. Nota: recordar que
     * las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        int a, c, d, x = 0;
        Scanner l = new Scanner(System.in);

        do {
            System.out.println("Escribir un número entero:");
            a = l.nextInt();
            System.out.println("");
        } while (a < 0);

        //y = a;
        while (a > 0) {

            c = a % 10;

            d = a / 10;

            a = d;

            x++;

        }
        System.out.println("El número de dígitos del valor ingresado es: " + x);
    }

}
