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
public class Extra8 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        int n = 99999, c = 0, p = 0, i = 0;
        Scanner l = new Scanner(System.in);

        while (!(n % 5 == 0)) {
            System.out.println("Inserte un numero:");
            n = l.nextInt();
            if (n<0) {
                continue;
            }
            c++;
            if (n % 2 == 0) {
                p++;
            } else {
                i++;
            }

        }
        System.out.println("Los numeros leidos fueron " + c);
        System.out.println("Los numeros pares fueron " + p);
        System.out.println("Los numeros impares fueron " + (i));
    }

}
