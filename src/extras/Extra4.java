/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/ 
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero entero del 1 al 10");
            num = leer.nextInt();
        } while (num < 1 || num > 10);

        switch (num) {
            case 1:
                System.out.println("El número " + num + " en números romanos es igual a I ");
                break;
            case 2:
                System.out.println("El número " + num + " en números romanos es igual a II ");
                break;
            case 3:
                System.out.println("El número " + num + " en números romanos es igual a III ");
                break;
            case 4:
                System.out.println("El número " + num + " en números romanos es igual a IV ");
                break;
            case 5:
                System.out.println("El número " + num + " en números romanos es igual a V ");
                break;
            case 6:
                System.out.println("El número " + num + " en números romanos es igual a VI ");
                break;
            case 7:
                System.out.println("El número " + num + " en números romanos es igual a VII ");
                break;
            case 8:
                System.out.println("El número " + num + " en números romanos es igual a VIII ");
                break;
            case 9:
                System.out.println("El número " + num + " en números romanos es igual a IX ");
                break;
            case 10:
                System.out.println("El número " + num + " en números romanos es igual a X ");
                break;
        }

    }

}
