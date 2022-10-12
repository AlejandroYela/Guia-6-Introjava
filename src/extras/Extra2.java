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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/ 
        int a, b, c, d, aux = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Asigne un valor entero a las variable A, B, C y D.");
        System.out.println("A:");
        a = leer.nextInt();
        System.out.println("B:");
        b = leer.nextInt();
        System.out.println("C:");
        c = leer.nextInt();
        System.out.println("D:");
        d = leer.nextInt();
        System.out.println("Le ha asignado el valor:");
        System.out.println("A= "+a);
         System.out.println("B= "+b);
          System.out.println("C= "+c);
           System.out.println("D= "+d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Las variables ahora tomaron los siguientes valores");
         System.out.println("A= "+a);
         System.out.println("B= "+b);
          System.out.println("C= "+c);
           System.out.println("D= "+d);
    }
    
}
