/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();

        String[][] sopadeletras = new String[20][20];
        String palabra = "";
        boolean vof = false;
        int c = 1, f = 0, col = 0, c1=0;

        int[] fcargadas = new int[5];

        for (int i = 0; i < 5; i++) {
            fcargadas[i] = -1;
        }

        System.out.println("Ingresa 20 palabras de entre 3 y 5 caracteres para completar la sopa de letras.");
        System.out.println("                                           SOPA DE LETRAS");
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int k = 0; k < 5; k++) {            
       
            do {
                System.out.print((k+1) + "ª palabra: ");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            do {
                f = rand.nextInt(20);
//                    f=5;
                for (int i = 0; i < 5; i++) {
                    if (fcargadas[i] == f) {
                        vof = true;
                        
                    } 
                }
                if (vof==false) {
                                               
                        if (fcargadas[c1]==-1) {
                         fcargadas[c1] = f;  
                         c1++;
                        } 
                        
                }                 
               
            } while (vof);

            col = rand.nextInt(20 - (palabra.length()));
            System.out.println("se guardo en fila " + (f+1) + " y columna " + (col+1) );
int cont=0;
            for (int i = 0; i < 20; i++) {
                if (i < col || i >= col+palabra.length()) {
                    sopadeletras[f][i] = String.valueOf(rand.nextInt(10));
                }
                if (i >= col && i < col+palabra.length()) {
                   
                sopadeletras[f][i] = palabra.substring((cont), (cont+1))  ;   
                   cont++; 
                }
                    
            }

        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopadeletras [i][j]==null) {
                     sopadeletras[i][j] = String.valueOf(rand.nextInt(10));
                }
            }
            
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + sopadeletras[i][j] + " ");
            }
            System.out.println("");
        }
    }

}

