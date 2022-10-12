/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
      
      int n, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
     n= leer.nextInt();
      int[] vector= new int [n];
      
      Random numero = new Random();
      
            
        for (int i = 0; i < n; i++) {
            vector[i]= numero.nextInt(20000);
            System.out.println(vector[i]);
            if(vector[i]<10){
                cont1++;
            }
            else if(vector[i]<100){
                cont2++;
            }
                else if(vector[i]<1000){
                cont3++;
            }  
                 else if(vector[i]<10000){
                cont4++;
            }     else{
                     cont5++;
                 }
        } 
        System.out.println("Cantidad de números de 1 cifra: "+cont1);
        System.out.println("Cantidad de números de 2 cifras: "+cont2);
        System.out.println("Cantidad de números de 3 cifras: "+cont3);
        System.out.println("Cantidad de números de 4 cifras: "+cont4);
        System.out.println("Cantidad de números de 5 cifras: "+cont5);

    }
    
}
