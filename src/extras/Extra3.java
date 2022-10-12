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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        
        String letra;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        letra = leer.next();
        letra = letra.toUpperCase();
        System.out.println(letra.length());
 
        
        if (!letra.equals("A") && !letra.equals("E")&& !letra.equals("I")&& !letra.equals("O")&& !letra.equals("U") ) {
            System.out.println("La caracter " +letra+ " no es una vocal" );    
        }else{
            System.out.println("La caracter " +letra+ " es una vocal");
        }   
        
    }
    
}
