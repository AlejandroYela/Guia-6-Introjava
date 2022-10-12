/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas.
        Nota: investigar la función toUpperCase() y toLowerCase() en Java*/
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        frase=leer.nextLine();
        
        frase=toUpperCase(frase);
        
        System.out.println("La frase en may. es: "+ frase);
        
        System.out.println("La frase en min. es: "+ frase.toLowerCase());
        
        
                
               
        
    }
    
}
