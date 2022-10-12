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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/ 
       
        double dias, min, hs, d2;
           
        System.out.println("Ingrese la cantidad de minutos a convertir");
        Scanner leer = new Scanner(System.in);
        min=leer.nextDouble();
        
        dias= min/60/24;
        d2= (int) dias;
        
           hs=(int)((dias-d2)*24);  
           

  System.out.println(min + " minutos es equivalente a " + d2 + " dias con " + hs + " horas.");
       
    }
    
}
