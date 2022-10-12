/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class Extra20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int t=sc.nextInt();
        int[] vector= new int[t];
        rellenar(vector,t);
        imprimir(vector,t);
    }

    private static void rellenar(int[] vector, int t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < t; i++) {
            vector[i]=(int) (Math.random() * 10);
        }
    }

    private static void imprimir(int[] vector, int t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < t; i++) {
            System.out.print("["+ vector[i]+"]");
        }
        System.out.println("");
    }
    
}
