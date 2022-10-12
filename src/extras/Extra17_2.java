/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class Extra17_2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
        // por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
        // primo, sino false
        
        int n;
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        
        if (esprimo(n)){
            System.out.println("El número "+n+" es primo");
        } else{
            System.out.println("El número "+n+" no es primo");
    }
        
        
    }
    
    public static boolean esprimo(int n) {
        if (n<=1){
            return false;
        }
        
        int cont=0;
        int divisor;
        for (divisor=(int)Math.sqrt(n); divisor>1; divisor--){
            if (n % divisor == 0){
                cont+=1;
            }
        }
        
        if (cont>=1){
            return false;
        } else {
            return true;
        }  
    }
   
}
