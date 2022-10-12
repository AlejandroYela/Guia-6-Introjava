/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author 2022
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        double centigrados;
        System.out.println("Ingrese los grados centigrados");
        centigrados = leer.nextDouble();
        double fahrenheit = 32 + (9*centigrados/5);
        System.out.println("El equivalente en grados fahrenheit es " + fahrenheit);
    }
    
}
