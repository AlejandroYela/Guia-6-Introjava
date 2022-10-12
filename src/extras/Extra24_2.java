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
public class Extra24_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner (System.in);
        int n;
        System.out.println("Hola, ingrese la sucesion de Fibonnaci a buscar");
        n=l.nextInt();
        System.out.println(fibonnaci(n));
    }
    
    public static int fibonnaci(int n) {
        
        int m;
        if (n==0) {
            m=0;
        }else if (n==1 || n==2) {          
           m=1;
        }else{
           m=fibonnaci(n-1)+fibonnaci(n-2);           
        }
        return m;
    } 
}
