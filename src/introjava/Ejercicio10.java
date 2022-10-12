/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. /*
        */
        Scanner leer = new Scanner(System.in);
        int num, suma, num2;
        System.out.println("Ingrese un nùmero ");
        num=leer.nextInt();
        suma=0;
        do {
            System.out.println("ingrese un nùmero a sumar: ");
            num2=leer.nextInt();
            suma=suma+num2;
        } while(suma<num);
        System.out.println("La suma fue de " +suma);
           
    }
    
}
