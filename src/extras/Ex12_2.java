/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

/**
 *
 * @author Usuario
 */
public class Ex12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int n1, n2, n3, c = 1;
        String n1cad, n2cad, n3cad, ntcad2 = "";
        do {
            n1 = (int) (Math.random() * 9);
            n2 = (int) (Math.random() * 9);
            n3 = (int) (Math.random() * 9);

            n1cad= String.valueOf(n1);
             n2cad= String.valueOf(n2);
              n3cad= String.valueOf(n3);       

              if (n1cad.equals("3")) {                  
                n1cad="E";
            }
              if (n2cad.equals("3")) {                  
                n2cad="E";
            }
              if (n3cad.equals("3")) {                  
                n3cad="E";
            }
            
              
            System.out.println(c + "ª contador: " + n1 + "-" + n2 + "-" + n3);
            System.out.println(c + "ª contador reemplazando 3 por E: " + n1cad + "-" + n2cad + "-" + n3cad );
            c++;
           
        } while (c < 20);

    }

} 
        
    

