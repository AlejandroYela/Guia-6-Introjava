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
public class Extra13 {

    /**
     * Crear un programa que dibuje una escalera de números, donde cada línea de
     * números comience en uno y termine en el número de la línea. Solicitar la
     * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
     * número 3: 1 12 123
     */
    public static void main(String[] args) {
        int a, s = 0;
        boolean b=false;
        Scanner l = new Scanner(System.in);
        System.out.println("Valor de la escalera:");
        a = l.nextInt();
        for (int i = 0; i <= a ; i++) {
            for (int j = 0; j <= a; j++) {
                b=(j<i);
                if (b) {
                    s = s + 1;
                    System.out.print(s);
                }
            }
            s = 0;
            System.out.println("");
        }
    }

}
