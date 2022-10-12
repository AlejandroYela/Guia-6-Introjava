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
public class Extra10 {

    /**
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        int a, b, c;
        a = (int) (Math.random() * (10) + 1);
        b = (int) (Math.random() * (10) + 1);
        System.out.println(a);
        System.out.println(b);
        Scanner l = new Scanner(System.in);
        System.out.println("El programa ha elegido dos números en un rango de 1 a 10"
                + " y los ha multiplicado, debe ingresar un número que represente esa "
                + "operación matematica");
        System.out.println("");

        do {
            System.out.println("Ingrese un valor entero positivo");
            c = l.nextInt();
            System.out.println("");
            if (c == (a * b)) {
                System.out.println("El valor ingresado corresponde a la multiplicación"
                        + " de a= " + a + " x b= " + b + " = " + c);
                System.out.println("");
            } else {
                System.out.println("El valor ingresado no corresponde a la multiplicación"
                        + " de a x b");
                System.out.println("");
            }

        } while (!(c == (a * b)));

    }

}
