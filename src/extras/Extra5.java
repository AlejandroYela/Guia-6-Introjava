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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
                o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
                o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
                o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
                o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/ 
        
        
        Scanner leer = new Scanner(System.in);   
        String socio;
        double tratamiento, efectivo;
        
        System.out.println("Ingrese el tipo de socio (A, B o C");
        socio=leer.next();
        socio=socio.toUpperCase();
        
        while (!socio.equals("A") && !socio.equals("B") && !socio.equals("C")) {
            System.out.println("El tipo de socio ingresado no existe. Por favor ingrese nuevamente que tipo de socio es (A, b o C).");
            socio=leer.next();
            socio=socio.toUpperCase();
        } 
        
        System.out.println("Ingrese el monto del tratamiento");
         tratamiento=leer.nextDouble();
         
         switch (socio) {
            case "A":
                efectivo=tratamiento*0.5;
                System.out.println("El monto a pagar en efectivo por el tratamiento es de $" + efectivo);
                break;
             case "B":
                efectivo=tratamiento*0.65;
                System.out.println("El monto a pagar en efectivo por el tratamiento es de $" + efectivo);
                break;
             case "C":
                System.out.println("No se aplica ningun descuento, el monto a pagar en efectivo por el tratamiento $" + tratamiento);
                break;
        }
         
        
    }
    
}
