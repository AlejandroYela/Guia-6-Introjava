/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments Realizar un programa que pida dos
     * números enteros positivos por teclado y muestre por pantalla el siguiente
     * menú: MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija
     * opción: El usuario deberá elegir una opción y el programa deberá mostrar
     * el resultado por pantalla y luego volver al menú. El programa deberá
     * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el
     * usuario selecciona la opción 5, en vez de salir del programa
     * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
     * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
     * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
     * menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  opc;
        double n1, n2;
        String r;
        r="a";
        System.out.println("Ingresar dos enteros positivos: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción:");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma es = " +(n1+n2));
                    break;
                case 2:
                    System.out.println("La resta es = " +(n1-n2));
                    break;
                case 3:
                    System.out.println("La multiplicación es = " +(n1*n2));
                    break;
                case 4:
                    System.out.println("La división es = " +(n1/n2));
                    break;
                case 5:
                    System.out.println("Está seguro que quiere salir? (S/N)");
                    r=leer.next();
                    break;
                default:
                     System.out.println("El número no es válido");
            }
            
        }while(!r.equalsIgnoreCase("s"));
        
    
    
    }

}
